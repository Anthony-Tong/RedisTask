package com.biz.servlet;

import com.biz.dao.StudentDao;
import com.biz.entity.Student;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * @author ChunjieTang
 * @create 2018-02-08 15:35
 */
public class AddServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(AddServlet.class);
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        StudentDao dao = new StudentDao();

        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String description = request.getParameter("description");
        String avgScore = request.getParameter("avgScore");
        String id = request.getParameter("id");
        if (StringUtils.isEmpty(id)) {
            id = UUID.randomUUID().toString().replace("-", "");
        }
        try {
            Student student = new Student(id, name, birthday, description, Integer.parseInt(avgScore));
            dao.addOrUpdate(student);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("添加失败");
            request.setAttribute("error", "添加失败");
        }

        request.getRequestDispatcher("list").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
