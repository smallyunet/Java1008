package com.ychs168.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see BaseServlet#BaseServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean loginResult = false;
		if(username != null && password != null) {
			if(username.equals("admin") && password.equals("1234")) {
				loginResult = true;
			}
		}
		if(loginResult) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect(request.getContextPath() + "/");
		} else {
			request.getSession().setAttribute("error", "username or password is wrong");
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
