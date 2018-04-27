<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
    <c:set var="info" value="hello mldn!!" scope="request"/>
    <c:remove var="info" scope="request"/>
    <h3>属性内容：${info}</h3>
</body>
</html>