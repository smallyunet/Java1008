<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
    pageContext.setAttribute("flagA",true);
    pageContext.setAttribute("flagB",false);
%>
<h3>与操作：${flagA && flagB} 或 ${flagA and flagB}</h3>
<h3>或操作：${flagA || flagB} 或 ${flagA or flagB}</h3>
<h3>非操作：${!flagA} 或 ${not flagA}</h3>
</body>
</html>