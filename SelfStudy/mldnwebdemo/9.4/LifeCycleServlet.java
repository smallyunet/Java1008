package org.lxh.servletdemo;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LifeCycleServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("** 1. Servlet 初始化 --> init()");
    }
    public void doGet(httpServletRequest req, HttpServletResponse resp) throws ServletException,java.io.IOException {
        System.out.println("** 2. Servlet 服务 --> doGet()、doPost()");
    }
    public void doPost(httpServletRequest req, HttpServletResponse resp) throws ServletException,java.io.IOException {
        this.doGet(req, resp);
    }
    public void destory() {
        System.out.println("88 3. Servlet 销毁 --> destory()");
    }
}