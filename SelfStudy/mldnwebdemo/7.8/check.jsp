<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<jsp:useBean id="reg" scope="request" class="cn.mldn.lxh.demo.Register"/>
<jsp:setProperty name="reg" property="*"/>
<body>

<%
    if(reg.isValidate()){
%>
    <jsp:forward page="success.jsp"/>
<%
    } else {
%>
    <jsp:forward page="index.jsp"/>
<%
    }
%>

</body>
</html>