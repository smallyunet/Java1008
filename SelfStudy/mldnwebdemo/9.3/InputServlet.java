package org.lxh.servletdemo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class InputServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info = req.getParameter("info");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>java web</title></head>");
        out.println("<body>");
        out.println("<h1>"+info+"</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}