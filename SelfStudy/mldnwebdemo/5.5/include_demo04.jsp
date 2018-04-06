<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
    <body>
    <% int x = 100; %>
        <h1>include_demo04.jsp -- <%=x%></h1>
        <%@include file="include.jsp"%>
    </body>
</html>