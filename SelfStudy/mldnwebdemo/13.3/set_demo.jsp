<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
    <c:set var="info" value="Hello mldn!!" scope="request"/>
    <h3>属性内容：${info}</h3>
</body>
</html>