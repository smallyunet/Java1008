<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Object username = session.getAttribute("username");
%>
<h1><%=username %></h1>
<span>当前用户【<%=session.getAttribute("username") %>】</span>
</body>
</html>