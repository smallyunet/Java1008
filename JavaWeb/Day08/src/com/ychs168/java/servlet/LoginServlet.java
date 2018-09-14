package com.ychs168.java.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int cookieLife = 1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String saveFlag = request.getParameter("saveFlag");
		
		if(username != null && password != null && username.equals("Tom") && password.equals("123")) {
			if(saveFlag != null && saveFlag.equals("on")) {
				Cookie usernameCookie = new Cookie("username", username);
				Cookie passwordCookie = new Cookie("password", password);
				
				usernameCookie.setMaxAge(this.cookieLife + 60);
				passwordCookie.setMaxAge(this.cookieLife + 60);
				
				usernameCookie.setPath("/");
				
				
				response.addCookie(usernameCookie);
				response.addCookie(passwordCookie);
			}
			response.getWriter().println("success");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		String cookieLife = config.getServletContext().getInitParameter("");
		if(cookieLife != null && cookieLife.matches("\\d+")) {
			
		}
	}
}
