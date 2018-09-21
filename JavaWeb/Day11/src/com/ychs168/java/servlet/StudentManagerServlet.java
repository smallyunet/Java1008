package com.ychs168.java.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.ychs168.java.util.DataCenter;
import com.ychs168.java.util.IContents;

public class StudentManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentManagerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		if(method != null) {
			switch(method) {
				case "toManagerPage":
					this.toManagerPage(request, response);
					break;
				case "queryStudents":
					this.queryStudent(request, response);
					break;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void toManagerPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> classList = DataCenter.getClassList();
		request.setAttribute(IContents.CLASS_LIST, classList);
		request.getRequestDispatcher("studentManager.jsp").forward(request, response);
	}
	
	private void queryStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String classinfo = request.getParameter("classinfo");
		List<String> studentList = DataCenter.getStudentList(classinfo);
		

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(studentList);
		
		response.getWriter().print(json);
	}
}
