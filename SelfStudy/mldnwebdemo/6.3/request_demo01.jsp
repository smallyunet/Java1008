<%@ page contentType="text/html" pageEncoding="GBK"%>
<html>
<head><title>123</title></head>
<body>
<%  // 接收表单参数
    request.setCharacterEncoding("GBK");
    String content = request.getParameter("info");
%>
<h2><%=content%></h2>
</body>
</html>