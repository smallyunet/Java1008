package com.ychs168.java.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ychs168.java.bean.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<User> users;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
users = new ArrayList<User>();
        
        User user = new User();
        user.setUsername("yuangong");
        user.setPasword("1234");
        List<String> authList = new ArrayList<String>();
        authList.add("yuangong.jsp");
        authList.add("login.jsp");
        authList.add("LoginServlet.jsp");
        authList.add("error.jsp");
        user.setAuthlist(authList);
        
        users.add(user);
        
        user = new User();
        user.setUsername("jingli");
        user.setPasword("1234");
        authList = new ArrayList<String>();
        authList.add("yuangong.jsp");
        authList.add("login.jsp");
        authList.add("LoginServlet.jsp");
        authList.add("jingli.jsp");
        authList.add("error.jsp");
        user.setAuthlist(authList);
        
        users.add(user);
        
        user = new User();
        user.setUsername("laoban");
        user.setPasword("1234");
        authList = new ArrayList<String>();
        authList.add("yuangong.jsp");
        authList.add("login.jsp");
        authList.add("LoginServlet.jsp");
        authList.add("jingli.jsp");
        authList.add("laoban.jsp");
        authList.add("error.jsp");
        user.setAuthlist(authList);
        
        users.add(user);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username != null) {
			boolean loginFlag = false;
			User user = null;
			for(User u : users) {
				if(u.getUsername().equals(username) && u.getPasword().equals(password)) {
					loginFlag = true;
					user = u;
					break;
				}
			}
			
			if(loginFlag) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				request.getRequestDispatcher("main.jsp").forward(request, response);
			} else {
				response.sendRedirect("login.jsp");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
