package com.ychs168.java.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	private Logger logger = LogManager.getLogger();
	
    /**
     * 登录过滤器中允许通过的路径
     */
	private String[] passList;
	
    public LoginFilter() {}

	public void destroy() {}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		logger.debug("Enter LoginFilter");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		String uri = req.getRequestURI();
		
//		logger.debug(uri);
//		logger.debug(Arrays.toString(this.passList));
		
		boolean allowFlag = false;
		// 1. 当前session中有没有登录成功的信息
		HttpSession session = req.getSession();
		String user = (String) session.getAttribute("user");
		if(user != null) {
			// 登录成功过
			chain.doFilter(request, response);
		} else {
			// 判断路径
			// 请求资源中包含允许通过的路径
			if(this.passList != null) {
				for(String path : passList) {
					if(uri.indexOf(path) > -1) {
						allowFlag = true;
						break;
					}
				}
			}
			if(allowFlag) {
				chain.doFilter(request, response);			
			} else {
				res.sendRedirect("login.jsp");
			}
		}
		
	}

	/**
	 * 初始化方法
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 1. 获取配置的参数
		String paths = fConfig.getInitParameter("passList");
		String[] pathList = paths.split(",");
		this.passList = pathList;
//		logger.debug(this.passList);
	}

}
