<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login1" method="post">
		<input type="hidden" name="flag" value="login" />
		用户名: <input type="text" name="username">
		密码: <input type="password" name="password">
		<input type="submit" value="登录">
	</form>
</body>
</html>