<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
    pageContext.setAttribute("num1",20);
    pageContext.setAttribute("num2",30);
%>
<h3>加法操作：${num1 + num2}</h3>
<h3>减法操作：${num1 - num2}</h3>
<h3>乘法操作：${num1 * num2}</h3>
<h3>除法操作：${num1 / num2} 或 ${num1 div num2}</h3>
<h3>取模操作：${num1 % num2} 或 ${num1 mod num2}</h3>
</body>
</html>