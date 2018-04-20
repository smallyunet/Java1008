<%@ page contentType="text/html;charset=UTF8" import="java.util.*" %>
<html>
    <head><title>java web</title></head>
    <body>
    <%
        Set all =  (Set) this.getServletContext().getAttribute("online");
        Iterator iter = all.iterator();
        while(iter.hasNext()) {
    %>
        <%=iter.next()%>
    <%
        }
    %>
    </body>
</html>