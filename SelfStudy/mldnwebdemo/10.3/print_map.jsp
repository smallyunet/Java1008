<%@ page contentType="text/html" pageEncoding="UTF8" import="java.util.*" %>
<html>
<head><title>java web</title></head>
<body>
<%
    Map map = new HashMap();
    map.put("lxh","李兴华");
    map.put("mldn","www.mldn.com");
    map.put("email","456@qq.com");
    request.setAttribute("info",map);
%>
<h3>key为lxh的内容：${info["lxh"]}</h3>
<h3>key为mldn的内容：${info.mldn}</h3>
<h3>key为email的内容：${info["email"]}</h3>
</body>
</html>