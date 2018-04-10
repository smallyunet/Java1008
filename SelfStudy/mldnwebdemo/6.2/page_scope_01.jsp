<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 设置 page属性范围，词属性只在当前JSP页面中起作用
    pageContext.setAttribute("name","smallyu");
    pageContext.setAttribute("birthday", new Date());
%>
<% // 从 page 属性范围中取出属性，并执行向下转型
    String username = (String)pageContext.getAttribute("name");
    Date userbirthday = (Date)pageContext.getAttribute("birthday");
%>
<h2>姓名：<%=username%></h2>
<h2>生日：<%=userbirthday%></h2>
</body>
</html>