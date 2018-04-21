<%@ page contentType="text/html" pageEncoding="UTF8" import="java.util.*" %>
<html>
<head><title>java web</title></head>
<body>
<%
    List all = (List) request.getAttribute("alldept");
    if(all != null) {
%>
        <table border="1" width="90%">
            <tr>
                <td>部门编号</td>
                <td>部门名称</td>
                <td>部门位置</td>
            </tr>
<%
        Iterator iter = all.iterator();
            while(iter.hasNext()){
                pageContext.setAttribute("dept",iter.next());
%>
            <tr>
                <td>${dept.deptno}</td>
                <td>${dept.dname}</td>
                <td>${dept.ioc}</td>
            </tr>
<%
            }
%>
        </table>
<%
    }
%>
</body>
</html>