package org.lxh.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionDemoServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        HttpSession ses = req.getSession();
        System.out.println("SESSION - > " + ses.getId());
        ses.setAttribute("username","李兴华");
        System.out.println("username属性内容：" + ses.getAttribute("username"));
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, java.io.IOException {
        this.doGet(req, resp);
    }
}