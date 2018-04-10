<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    String path = this.getServletContext().getRealPath("/");
%>
    <h3>真实路径：<%=path%></h3>
</body>
</html>
