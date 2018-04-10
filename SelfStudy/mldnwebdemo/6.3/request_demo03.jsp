<%@ page contentType="text/html" pageEncoding="GBK"%>
<html>
<head><title>123</title></head>
<body>
<%  // 接收表单参数
    request.setCharacterEncoding("GBK");
    String param1 = request.getParameter("name");
    String param2 = request.getParameter("password");
%>
<h2><%=param1%></h2>
<h2><%=param2%></h2>
</body>
</html>