package org.lxh.eldemo.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.lxh.eldemo.vo.Dept;
public class ELListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Dept> all = new ArrayList<Dept>();
        Dept dept = null;
        dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("mldn教学部");
        dept.setIoc("北京西城区");
        all.add(dept);
        dept = new Dept();
        dept.setDeptno(20);
        dept.setDname("mldn教学部2");
        dept.setIoc("北京西城区2");
        all.add(dept);
        request.setAttribute("alldept",all);
        request.getRequestDispatcher("dept_list.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}