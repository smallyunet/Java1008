<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 从 page 属性范围中取出属性，并执行向下转型
    String username = (String)session.getAttribute("name");
    Date userbirthday = (Date)session.getAttribute("birthday");
%>
<h2>姓名：<%=username%></h2>
<h2>生日：<%=userbirthday%></h2>
</body>
</html>