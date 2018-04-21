<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head><title>java web</title></head>
<body>

<h3>IP地址： ${pageContext.request.remoteAddr}</h3>
<h3>session id： ${pageContext.session.id}</h3>

<%-- 报错了 --%>
<h3>是否是新的session： ${pageContext.session.new}</h3>

</body>
</html>