<%@ page contentType="text/html" pageEncoding="utf8" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<html>
<head><title>java web</title></head>
<body>
    <c:catch var="errmsg">
        <%
            int result = 10 / 0;
        %>
    </c:catch>
    <h3>异常信息：${errmsg}</h3>
</body>
</html>