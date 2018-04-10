<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<%  
    String method = request.getMethod();
    String ip = request.getRemoteAddr();
    String path = request.getServletPath();
    String contextPath = request.getContextPath();
%>
    <h3>请求方式：<%=method%></h3>
    <h3>IP：<%=ip%></h5>
    <h3>路径：<%=path%></h3>
    <h3>上下文：<%=contextPath%></h5>

</body>
</html>