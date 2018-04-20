<%@ page contentType="text/html;charset=UTF8" import="java.util.*" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<h2>用户登录程序</h2>
<%
    request.setCharacterEncoding("GBK");
%>
<%
    List<String> info = (List<String>) request.getAttribute("info");
    if(info != null) {
        Iterator<String> iter = info.iterator();
        while(iter.hasNext()){
%>
    <h4><%=iter.next()%></h4>
<%
        }
    }
%>
<form action="LoginServlet" method="post">
    用户: <input type="text" name="userid"><br>
    密码: <input type="text" name="userpass"><br>
    <input type="submit" balue="登录">
</form>
</body>
</html>