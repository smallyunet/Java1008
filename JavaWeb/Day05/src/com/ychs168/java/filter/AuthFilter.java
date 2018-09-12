package com.ychs168.java.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ychs168.java.bean.User;

/**
 * Servlet Filter implementation class AuthFilter
 */
public class AuthFilter implements Filter {
	private Logger logger = LogManager.getLogger();
	
	private List<User> users;

    /**
     * Default constructor. 
     */
    public AuthFilter() {
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
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String uri = req.getRequestURI();
		User user = (User) req.getSession().getAttribute("user");
		boolean authFlag = false;
		
		if(user == null) {
			authFlag = true;
		} else {
			List<String> authList = user.getAuthlist();
			for (String auth : authList) {
				if(uri.indexOf(auth) > -1) {
					authFlag = true;
					break;
				}
			}
		}
		
		if(authFlag) {
			chain.doFilter(request, response);
		} else {
			res.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
