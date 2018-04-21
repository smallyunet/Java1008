<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
    pageContext.setAttribute("num1",10);
    pageContext.setAttribute("num2",20);
    pageContext.setAttribute("num3",30);
%>
<h3>与操作：${empty info}</h3>
<h3>或操作：${num1 > num2 ? "大于" : "小于"}</h3>
<h3>非操作：${num1 * (num2 + num3)}</h3>
</body>
</html>