<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>Java Web</title></head>
<body>
<%
    Cookie c[] = request.getCookies();  // 取得全部cookie
    for (int x = 0;x<c.length;x++) {
%>
    <h3><%=c[x].getName()%> --> <%=c[x].getValue()%></h3>
<%
    }
%>
</body>
</html>