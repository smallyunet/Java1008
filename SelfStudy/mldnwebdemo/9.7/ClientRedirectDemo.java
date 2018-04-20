package org.lxh.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientRedirectDemo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        req.getSession().setAttribute("name","李兴华");
        req.setAttribute("info","MLDNJAVA");
        resp.sendRedirect("get_info.jsp");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        this.doGet(req, resp);
    }
}

