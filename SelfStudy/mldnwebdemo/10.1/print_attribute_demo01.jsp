<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
    request.setAttribute("info","www.mldn.com");
    if(request.getAttribute("info") != null) {
%>
    <h3><%=request.getAttribute("info")%></h3>
<%
    }
%>
</body>
</html>