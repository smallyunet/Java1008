<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<%
	String[] filenames = (String[]) request.getAttribute("filenames");
	for (String filename : filenames) {
%>
		<li><a href="DownloadServlet?filename=<%=filename %>"><%=filename %></a></li>
<%
	}
%>
</ul>
</body>
</html>