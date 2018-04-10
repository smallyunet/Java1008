<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    String dbDriver = config.getInitParameter("diver");
    String dbUrl = config.getInitParameter("url");
%>
<h3>驱动程序：<%=dbDriver%></h3>
<h3>连接地址：<%=dbUrl%></h3>
</body>
</html>