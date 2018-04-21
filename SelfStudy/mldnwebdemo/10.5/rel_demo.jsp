<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>
<%
    pageContext.setAttribute("num1",20);
    pageContext.setAttribute("num2",30);
%>
<h3>相等判断：${num1 == num2} 或 ${num1 eq num2}</h3>
<h3>不等判断：${num1 != num2} 或 ${num1 ne num2}</h3>
<h3>小于判断：${num1 < num2} 或 ${num1 lt num2}</h3>
<h3>大于判断：${num1 > num2} 或 ${num1 gt num2}</h3>
<h3>小于等于判断：${num1 <= num2} 或 ${num1 le num2}</h3>
<h3>大于等于判断：${num1 >= num2} 或 ${num1 ge num2}</h3>
</body>
</html>