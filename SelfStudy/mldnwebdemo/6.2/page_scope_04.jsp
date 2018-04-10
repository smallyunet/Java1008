<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 设置 page属性范围，词属性只在当前JSP页面中起作用
    pageContext.setAttribute("name","smallyu",PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("birthday", new Date(),PageContext.REQUEST_SCOPE);
%>
<jsp:forward page="request_scope_02.jsp"/>
</body>
</html>