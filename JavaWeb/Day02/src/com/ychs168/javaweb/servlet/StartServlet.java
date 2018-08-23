/* CopyRight */
package com.ychs168.javaweb.servlet;

import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 测试servlet生命周期
 * @author smallyu
 *
 */
public class StartServlet extends HttpServlet {
	final static private Logger logger = LogManager.getLogger();
	
	public StartServlet() {
		logger.info("Servlet created");
	}
}
