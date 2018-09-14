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
		Cookie[] cookies = request.getCookies();
	
		if(cookies != null) {
			for(Cookie c : cookies) {
				String name = c.getName();
				String value = c.getValue();
				if(name.equals("username")) {
					request.setAttribute("username", value);
				} else if (name.equals("password") {
					request.setAttribute("password", value);
				}
			}
		}
	%>
	
	<form name="frm" action="LoginServlet" method="post">
	用户名：<input type="text" value="${requestScope.username}" />
	密码：<input type="password" value="${requestScope.password}" />
	<input type="submit" />
	
	<script>
		var username = document.getElementsByTagName('input')[0]
		var password = document.getElementsByTagname('input')[1]
		if(username != null && password != null) {
			document.frm.submit()
		}
	</script>
</form>
</body>
</html>