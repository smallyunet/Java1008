<%@ page contentType="text/html" pageEncoding="UTF8" %>

<html>
<head><title>Java web</title></head>
<jsp:useBean id="cou" scope="request" class="cn.mldn.lxh.demo.Count"/>
<body>
<h3>第<jsp:getProperty name="cou" property="count"/>次访问！</h3>
</body>
</html>
