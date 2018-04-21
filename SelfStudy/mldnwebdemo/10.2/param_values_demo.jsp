<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>

<% request.setCharacterEncoding("UTF8"); %>

<h3>第一个参数是：${paramValues.inst[0]}</h3>
<h3>第二个参数是：${paramValues.inst[1]}</h3>
<h3>第三个参数是：${paramValues.inst[2]}</h3>

</body>
</html>