<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<% // 设置 request 属性范围，词属性只在当前JSP页面中起作用
    request.setAttribute("name","smallyu");
    request.setAttribute("birthday", new Date());
%>
<%-- 服务器跳转下一个页面可以接收值 --%>
<%-- <jsp:forward page="request_scope_02.jsp"/> --%>

<%-- 客户端跳转不属于request范围 --%>
<a href="request_scope_02.jsp">跳转</a>
</body>
</html>