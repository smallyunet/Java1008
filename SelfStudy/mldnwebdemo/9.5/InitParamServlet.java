package org.lxh.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
    private String initParam = null;

    public void init(ServletConfig config) throws ServletException {
        this.initParam = config.getInitParameter("ref");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        System.out.println("初始化参数：" + this.initParam);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        this.doGet(req, resp);
    }
}