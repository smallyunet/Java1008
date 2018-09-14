<%@page import="java.util.List"%>
<%@page import="com.ychs168.java.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = (User) request.getAttribute("user");
		List<User> users = (List) request.getAttribute("users");
	%>

	id -> ${user.id}, name -> ${user.name}, age -> ${user.age}

	<hr />

	<div>在pageScope中查找的结果 id -> ${pageScope.user.id}</div>
	<div>在requestScope中查找的结果 id -> ${requestScope.user.id}</div>
	<div>在sessionScope中查找的结果 id -> ${sessionScope.user.id}</div>
	<div>在applicationScope中查找的结果 id -> ${applicationScope.user.id}</div>

	<hr />

	<div>
		<ul>
			<c:forEach items="${users}" var="user">
				<li>id -> ${user.id}, name -> ${user.name}, age -> ${user.age}</li>
			</c:forEach>
		</ul>

	</div>
</body>
</html>