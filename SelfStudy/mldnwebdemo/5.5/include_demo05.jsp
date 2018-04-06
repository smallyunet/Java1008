<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
    <body>
    <% int x = 100; %>
        <h1>include_demo05.jsp -- <%=x%></h1>
        <jsp:include page="include.jsp"/>
    </body>
</html>