<%@ page contentType="text/html" pageEncoding="UTF8"%>
<%@ page import="java.util.*"%>
<html>
<head><title>123</title></head>
<body>
<%  // 接收表单参数
    request.setCharacterEncoding("UTF8");
%>

<center>
<table border="1">
    <tr>
        <td>参数名称</td>
        <td>参数内容</td>
    </tr>
<%
    Enumeration enu = request.getParameterNames();  // 接收全部参数
    while(enu.hasMoreElements()){
        String paramName = (String) enu.nextElement();
%>
    <tr>
        <td><%=paramName%></td>
        <td>
<%
    if(paramName.startsWith("**")){
            String paramValue[] = request.getParameterValues(paramName);
            for(int x=0;x<paramValue.length;x++) {
%>
    <%=paramValue[x]%>、
<%
            }
    } else {
        String paramValue = request.getParameter(paramName);
%>
    <%=paramValue%>
<%
    }
%>
        </td>
    </tr>
<%
    }
%>
</table>
</center>

</body>
</html>