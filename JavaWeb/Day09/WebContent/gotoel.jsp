<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="el.jsp"></jsp:forward>
	<jsp:useBean id="user" class="com.ychs168.java.bean.User"></jsp:useBean>
	<jsp:setProperty property="id" name="user"/>
	编号：<jsp:getProperty property="id" name="user"/>
	姓名：<input type="text" />
</body>
</html>

	