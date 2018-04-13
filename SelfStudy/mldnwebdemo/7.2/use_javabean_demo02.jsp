<%@ page contentType="text/html" pageEncoding="UTF8" %>
<jsp:useBean id="simple" scope="page" class="cn.mldn.lxh.demo.SimpleBean"/>
<html>
<head>
    <title>java web</title>
</head>
<body>
<%
    simple.setName("smallyu");
    simple.setAge(60);
%>
<h3>姓名： <%=simple.getName()%></h3>
<h3>年龄： <%=simple.getAge()%></h3>
</body>
</html>