<%@ page contentType="text/html" pageEncoding="UTF8" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<form action="login.jsp" method="post">
    用户名：<input type="text" name="uname"><br>
    密码:<input type="password" name="upass"><br>
    <input type="submit" value="登录">
</form>
<%
    String name = request.getParameter("uname");
    String password = request.getParameter("upass");
    if(!(name==null || "".equals(name)
        || password==null||"".equals(password))){
        
        if(("lixinghua").equals(name)&&"mldn".equals(password)){ 
            response.setHeader("refresh","2;UrL=welcome.jsp");  // 2秒后跳转
            session.setAttribute("userid",name);    // 将用户名存在session中
%>
    <h3>用户登录成功，两秒后跳转到欢迎页！</h3>
    <h3>如果没有跳转，请按<a href="welcome.jsp">这里</a></h3>
<%
        } else {
%>
    <h3>错误的用户名或密码！</h3>
<%
        }
    }
%>
</body>
</html>
