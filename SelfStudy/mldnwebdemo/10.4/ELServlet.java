package org.lxh.eldemo.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.lxh.eldemo.vo.Dept;
public class ELServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("mldn教学部");
        dept.setIoc("北京西城区");
        request.setAttribute("deptinfo",dept);
        request.getRequestDispatcher("dept_info.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}