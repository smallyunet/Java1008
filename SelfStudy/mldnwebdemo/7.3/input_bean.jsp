<%@ page contentType="text/html" pageEncoding="UTF8" %>

<html>
<head><title>Java web</title></head>
<body>
<jsp:useBean id="simple" scope="page" class="cn.mldn.lxh.demo.SimpleBean"/>
<jsp:setProperty name="simple" property="*"/>
<h3>姓名：<%=simple.getName()%></h3>
<h3>年龄：<%=simple.getAge()%></h3>
<h3></h3>
</body>
</html>