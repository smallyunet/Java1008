<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<%  
    Enumeration enu = request.getHeaderNames();
    while(enu.hasMoreElements()){
        String headerName = (String)enu.nextElement();
        String headerValue = request.getHeader(headerName);
%>
    <h5><%=headerName%> -- <%=headerValue%></h5>
<%
    }
%>

</body>
</html>