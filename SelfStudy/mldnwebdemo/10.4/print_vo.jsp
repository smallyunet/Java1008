<%@ page contentType="text/html" pageEncoding="UTF8" import="org.lxh.eldemo.vo.*" %>
<html>
<head><title>java web</title></head>
<body>
<%
    Dept dept = new Dept();
    dept.setDeptno(10);
    dept.setDname("北京");
    dept.setIoc("北京市西城区");
    request.setAttribute("deptinfo",dept);
%>
<h3>部门编号：${deptinfo.deptno}</h3>
<h3>部门名称：${deptinfo.dname}</h3>
<h3>部门位置：${deptinfo.ioc}</h3>
</body>
</html>
