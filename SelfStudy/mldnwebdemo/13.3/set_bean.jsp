<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ page import="org.lxh.jstldemo.vo.*" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
    <%
        SimpleInfo sim = new SimpleInfo();
        request.setAttribute("simple",sim);
    %>
    <c:set value="Hello mldn!!" target="${simple}" property="content"/>
    <h3>属性内容：${simple}</h3>
    <%-- 加content报错了，不知道原因 --%>
</body>
</html>