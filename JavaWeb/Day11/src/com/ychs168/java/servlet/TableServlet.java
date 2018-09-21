package com.ychs168.java.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.ychs168.java.bean.Student;
import com.ychs168.java.util.Utils;

public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TableServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Object> studentList = new ArrayList<>();
		Student student;
		for (int i = 0; i < 10; i++) {
			student = new Student(i, "name" + (i + 1), i % 2);
			studentList.add(student);
		}
		String json = Utils.getJSON(studentList);
		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
