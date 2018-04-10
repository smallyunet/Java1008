<%@ page contentType="text/html" pageEncoding="UTF8"%>
<html>
<head><title>123</title></head>
<body>
<%  // 接收表单参数
    request.setCharacterEncoding("GBK");
    String id = request.getParameter("id");
    String name = request.getParameter("uname");
    String inst[] = request.getParameterValues("inst");
%>
<h3>编号：<%=id%></h3>
<h3>姓名：<%=name%></h3>
<%
    if (inst != null) {
%>
<h3>兴趣：
<%
    for(int x=0;x<inst.length;x++) {
%>
        <%=inst[x]%>、
<%
    }
%>
</h3>
<%
    }
%>
</body>
</html>