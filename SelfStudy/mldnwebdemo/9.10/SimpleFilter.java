package org.lxh.filterdemo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        String initParam = config.getInitParameter("ref");
        System.out.println("过滤器初始化，初始化参数 = " + initParam);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("执行doFilter()方法之前");
        chain.doFilter(request, response);
        System.out.println("执行doFilter()方法之后");
    }

    public void destroy() {
        System.out.println("过滤器销毁");
    }
}