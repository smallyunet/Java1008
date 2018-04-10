<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    long start = session.getCreationTime();
    long end = session.getLastAccessedTime();
    long time = (end - start) / 1000;
%>
    <h3>你已经停留了<%=time%>秒！</h3>
</body>
</html>
