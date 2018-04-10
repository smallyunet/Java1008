<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>Java Web</title></head>
<body>
<%!  
    int count = 0;
%>
<%
    response.setHeader("refresh","3;URL=hello.htm");  // 三秒后跳转
%>
</body>
</html>