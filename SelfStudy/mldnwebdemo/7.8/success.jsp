<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<jsp:useBean id="reg" scope="request" class="cn.mldn.lxh.demo.Register"/>
<body>
    用户名：<jsp:getProperty name="reg" property="name"/><br>
    年龄：<jsp:getProperty name="reg" property="age"/><br>
    Email：<jsp:getProperty name="reg" property="email"/><br>
</body>
</html>