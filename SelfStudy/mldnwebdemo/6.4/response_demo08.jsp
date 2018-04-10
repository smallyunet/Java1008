<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>Java Web</title></head>
<body>
<%
    Cookie c1 = new Cookie("lxh","lixinghua");  // 定义新的对象
    Cookie c2 = new Cookie("mldn","www.mldn.cn");
    c1.setMaxAge(60);
    c2.setMaxAge(60);
    response.addCookie(c1); // 向客户端添加
    response.addCookie(c2);
%>
</body>
</html>