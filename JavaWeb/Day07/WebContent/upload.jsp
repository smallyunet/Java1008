<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UploadServlet" method="post" enctype="multipart/form-data">
		用户名：<input type="text" name="username" />
		年龄：<input type="number" name="age" />
		头像：<input type="file" name="avatar" multiple />
		<input type="submit" />
	</form>
</body>
</html>