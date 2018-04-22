<%@ page contentType="text/html;charset=UTF8" %>
<%@ taglib prefix="mytag" uri="mldn" %>
<html>
<head>
    <title>java web</title>
</head>
<body>
    <%
        String scope = "session";
        session.setAttribute("username","李兴华");
    %>
    <mytag:present name="username" scope="<%=scope%>">
        <h2><%=scope%>范围存在属性，内容是："${sessionScope.username}"</h2>
    </mytag:present>
    <mytag:present name="allusers" scope="request">
        <h2><%=request%>范围存在属性，内容是："${requestScope.allusers}"</h2>
    </mytag:present>
</body>
</html>