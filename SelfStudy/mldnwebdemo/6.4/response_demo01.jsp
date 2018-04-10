<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>Java Web</title></head>
<body>
<%!  
    int count = 0;
%>
<%
    response.setHeader("refresh","2");  // 两秒刷新一次
%>
<h3>已经访问了<%=count++%>次</h3>
</body>
</html>