<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
   <c:if test="${param.ref=='mldn'}" var="res1" scope="page">
    <h3>欢迎${param.ref}光临！</h3>
   </c:if>
   <c:if test="${10<30}" var="res2">
    <h3>10 比 30 小</h3>
   </c:if>
</body>
</html>