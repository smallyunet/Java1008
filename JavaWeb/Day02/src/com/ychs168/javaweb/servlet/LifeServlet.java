/* CopyRight */
package com.ychs168.javaweb.servlet;

import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 演示声明周期
 * @date 2018.08.23
 * @author smallyu
 * @version 1.0
 */
public class LifeServlet extends HttpServlet {

	Logger logger = LogManager.getLogger();
	
	public LifeServlet() {
		logger.info("Servlet created");
	}
}
