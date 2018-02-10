package com.biz.servlet;

import com.biz.dao.StudentDao;
import com.biz.entity.PageBean;
import com.biz.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChunjieTang
 * @create 2018-02-08 18:19
 */
public class ListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDao dao = new StudentDao();
        String strPageNO = request.getParameter("pageNo");
        int pageNo = 1;
        if (!StringUtils.isEmpty(strPageNO)) {
            pageNo = Integer.parseInt(strPageNO);
        }
        int pageSize = 5;

        List<Student> stus = new ArrayList<Student>();
        List<String> students = dao.findAll(pageNo, pageSize);
        ObjectMapper mapper = new ObjectMapper();
        for (String stu : students) {
            Student student = mapper.readValue(stu, Student.class);
            stus.add(student);
        }

        int count = dao.getCount();
        PageBean<Student> pageBean = new PageBean<Student>(pageNo,count,pageSize,stus);
        request.setAttribute("pageBean", pageBean);
        request.getRequestDispatcher("listStudent.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
