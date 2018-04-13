<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ page import="cn.mldn.lxh.demo.*" %>
<html>
<head>
    <title>java web</title>
</head>
<body>
<%
    SimpleBean simple = new SimpleBean();
    simple.setName("smallyu");
    simple.setAge(60);
%>
<h3>姓名： <%=simple.getName()%></h3>
<h3>年龄： <%=simple.getAge()%></h3>
</body>
</html>