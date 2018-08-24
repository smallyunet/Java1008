package com.ychs168.javaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
		String path;
		if (loginFlag) {
//			successForward(request, response, username);
			successRedirect(request, response, username);
		} else {
//			loginForward(request, response);
			loginRedirect(request, response);
		}
	}
	
	private void successRedirect(HttpServletRequest request, HttpServletResponse response, String username)
			throws ServletException, IOException {
		String path = "";
		logger.info("登录成功");
		// 转发
//		path = "ForwardServlet?path=WEB-INF/views/forward.jsp";
//		path = "ForwardServlet";
//		path = "ForwardServlet";
//		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
//		request.setAttribute("path", path);
//		dispatcher.forward(request, response);
		request.getSession().setAttribute("username", username);
		
		response.sendRedirect(request.getContextPath() + "/" + path);
	}

	private void successForward(HttpServletRequest request, HttpServletResponse response, String username)
			throws ServletException, IOException {
		String path;
		logger.info("登录成功");
		// 转发
		path = "WEB-INF/views/forward.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		request.setAttribute("username", username);
		dispatcher.forward(request, response);
	}
	
	/**
	 * 登录失败后重定向
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void loginRedirect(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("登录失败");
//		String project = request.getContextPath();
//		logger.info(project);
		HttpSession session = request.getSession();
		session.setAttribute("error", "username or password is wrong");
		String location = "login.jsp";
		response.sendRedirect(location);
	}

	/**
	 * 登录失败后转发
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void loginForward(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path;
		logger.info("登录失败");
		path = "login.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		request.setAttribute("error", "username or parrword is error");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
