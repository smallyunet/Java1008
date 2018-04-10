<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>Java Web</title></head>
<body>
<%
    String id = session.getId();    // 取得session id
%>
<h3>session id: <%=id%></h3>
<h3>session length: <%=id.length()%></h3>
</body>
</html>