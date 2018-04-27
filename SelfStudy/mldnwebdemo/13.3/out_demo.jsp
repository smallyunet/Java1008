<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
    <%
        pageContext.setAttribute("info","<www.mldn.cn>");
    %>
    <h3>属性存在：<c:out value="${info}"/></h3>
    <h3>属性不存在：<c:out value="${ref}" default="没有此内容！"/></h3>
    <h3>属性不存在：<c:out value="${ref}">没有此内容！</c:out></h3>
</body>
</html>