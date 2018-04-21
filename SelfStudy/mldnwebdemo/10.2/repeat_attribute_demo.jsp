<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
   pageContext.setAttribute("info","page属性范围");
   request.setAttribute("info","request属性范围");
   session.setAttribute("info","session属性范围");
   application.setAttribute("info","application属性范围");
%>
<h3>${info}</h3>
</body>
</html>