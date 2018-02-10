package com.biz.servlet;

import com.biz.dao.StudentDao;
import com.biz.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ChunjieTang
 * @create 2018-02-10 11:24
 */
public class LoadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDao dao = new StudentDao();
        String id = request.getParameter("id");
        String stuJson = dao.findById(id);
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(stuJson, Student.class);
        request.setAttribute("student", student);
        request.getRequestDispatcher("addStudent.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
