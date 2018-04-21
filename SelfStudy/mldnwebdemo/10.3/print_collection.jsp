<%@ page contentType="text/html" pageEncoding="UTF8" import="java.util.*" %>
<html>
<head><title>java web</title></head>
<body>
<%
    List all = new ArrayList();
    all.add("李兴华");
    all.add("www.mldn.com");
    all.add("123@qq.com");
    request.setAttribute("allinfo",all);
%>
<h3>第一个元素：${allinfo[0]}</h3>
<h3>第二个元素：${allinfo[1]}</h3>
<h3>第三个元素：${allinfo[2]}</h3>
</body>
</html>