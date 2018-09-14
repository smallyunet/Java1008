package com.ychs168.java.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ychs168.java.bean.User;

/**
 * Servlet implementation class ELServlet
 */
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ELServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User(1, "Tom", 18);
		request.setAttribute("user", user);
		
		List<User> users = new ArrayList<User>();
		users.add(new User(2, "a", 11));
		users.add(new User(3, "b", 12));
		users.add(new User(4, "c", 13));
		request.setAttribute("users", users);
		
		Map<String, List<User>> map = new HashMap<>();
		List<User> list1 = new ArrayList<User>();
		list1.add(new User(2, "a", 11));
		list1.add(new User(3, "b", 12));
		list1.add(new User(4, "c", 13));
		map.put("class1", list1);
		
		List<User> list2 = new ArrayList<User>();
		list2.add(new User(2, "a", 11));
		list2.add(new User(3, "b", 12));
		list2.add(new User(4, "c", 13));
		map.put("class2", list2);
		
		List<User> list3 = new ArrayList<User>();
		list3.add(new User(2, "a", 11));
		list3.add(new User(3, "b", 12));
		list3.add(new User(4, "c", 13));
		map.put("class3", list3);
		
		request.getRequestDispatcher("el.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
