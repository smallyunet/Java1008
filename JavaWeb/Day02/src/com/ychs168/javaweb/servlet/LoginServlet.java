package com.ychs168.javaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 登录的Servlet
 * @date 2018.08.23
 * @author smallyu
 *
 */
public class LoginServlet extends BaseServlet implements Servlet {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean loginFlag = false;
		if (username != null && password != null) {
			if(username.equals("admin") && password.equals("1234")) {
				loginFlag = true;
			}
		}
		if (loginFlag) {
			logger.info("登录成功");
			// 转发
			String path = "WEB-INF/views/forward.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			request.setAttribute("username", username);
			dispatcher.forward(request, response);
		} else {
			logger.info("登录失败");
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
