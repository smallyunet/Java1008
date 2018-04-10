<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 设置 page属性范围，词属性只在当前JSP页面中起作用
    pageContext.setAttribute("name","smallyu");
    pageContext.setAttribute("birthday", new Date());
%>
<jsp:forward page="page_scope_03.jsp"/>
</body>
</html>