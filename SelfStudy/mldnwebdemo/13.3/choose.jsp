<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
   <%
    pageContext.setAttribute("num", 10);
   %>
   <c:choose>
    <c:when test="${num==10}">
        <h3>num1 属性的内容是 10</h3>
    </c:when>
    <c:when test="${num==20}">
        <h3>num1 属性的内容是 20</h3>
    </c:when>
    <c:otherwise>
        <h3>没有条件满足</h3>
    </c:otherwise>
   </c:choose>
</body>
</html>