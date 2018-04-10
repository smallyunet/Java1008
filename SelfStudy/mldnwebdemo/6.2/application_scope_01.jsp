<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 设置 application 属性范围，词属性只在当前JSP页面中起作用
    application.setAttribute("name","smallyu");
    application.setAttribute("birthday", new Date());
%>

<%-- 客户端跳转 --%>
<a href="session_scope_02.jsp">跳转</a>
</body>
</html>