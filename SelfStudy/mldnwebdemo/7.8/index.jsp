<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<jsp:useBean id="reg" scope="request" class="cn.mldn.lxh.demo.Register"/>
<body>

<form action="check.jsp" method="post">
    用户名：<input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>">
        <%=reg.getErrorMsg("errname")%><br>
    年龄：<input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>">
        <%=reg.getErrorMsg("errage")%><br>
    Email：<input type="text" name="email" value="<jsp:getProperty name="reg" property="email"/>">
        <%=reg.getErrorMsg("erremail")%><br>
    <input type="submit" value="注册">
</form>
</body>
</html>