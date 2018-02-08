package com.biz.servlet;

import com.biz.dao.StudentDao;
import com.biz.entity.Student;

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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        StudentDao dao = new StudentDao();
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String description = request.getParameter("description");
        String avgScore = request.getParameter("avgScore");
        String id = UUID.randomUUID().toString().replace("-", "");

        try {
            Student student = new Student(id, name, birthday, description, Integer.parseInt(avgScore));
            dao.addOrUpdate(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
