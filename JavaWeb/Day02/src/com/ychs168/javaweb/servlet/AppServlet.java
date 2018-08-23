/* CopyRight */
package com.ychs168.javaweb.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 测试servlet初始化参数
 * Servlet implementation class AppServlet
 * @data 2018.08.23
 * @author smallyu
 * @version 1.0
 */
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
    	logger.info("service");
    }

    /**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		logger.info("初始化");
		// 获取单个参数
		String appName = config.getInitParameter("appName");
		logger.info("appName -> " + appName);
		// 获取所有参数
		Enumeration<String> paramNames = config.getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			appName = paramNames.nextElement();
			logger.info("appName -> " + appName
					+ "version -> " + config.getInitParameter(appName));
		}
		String global = config.getServletContext().getInitParameter("global");
		logger.info("global -> " + global);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		logger.info("destory");
		// TODO Auto-generated method stub
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("doGet");
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("doPost");
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
