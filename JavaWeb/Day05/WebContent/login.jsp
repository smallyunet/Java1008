<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	login.jsp
	<%
		Integer number = (Integer) application.getAttribute("online");
	%>
	当前在线人数 <%=number %>
	<form action="main.jsp">
		用户名： <input type="text" name="username" />
		密码： <input type="password" name="password" />
		<input type="submit" value="提交" />
	</form>
</body>
</html>