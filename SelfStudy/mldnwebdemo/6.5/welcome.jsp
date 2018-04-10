<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    if(session.getAttribute("userid")!=null){
%>
    <h3>欢迎<%=session.getAttribute("userid")%>光临本系统，<a href="logout.jsp">注销</a></h3>
<%
    } else {
%>
    <h3>请先进行系统的<a href="login.jsp">登录</a>！</h3>
<%
    }
%>
</body>
</html>
