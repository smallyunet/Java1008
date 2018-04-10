<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    if(session.isNew()){
%>
    <h3>欢迎新用户光临！</h3>
<%
    } else {
%>
    <h3>你已经是老用户了！</h3>
<%
    }
%>
</body>
</html>
