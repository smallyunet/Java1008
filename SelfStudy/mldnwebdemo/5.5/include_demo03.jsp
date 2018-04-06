<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
    <body>
<% 
    String username = "lixinghua"; 
%>
        <h1>包含带参数</h1>
        <jsp:include page="receive_param.jsp">
            <jsp:param name="name" value="<%=username%>"/>
            <jsp:param name="info" value="www.abc.com"/>
        </jsp:include>
    </body>
</html>