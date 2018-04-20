<%@ page contentType="text/html;charset=UTF8" import="java.util.*" %>
<html>
    <head><title>java web</title></head>
    <body>
        <form action="login.jsp" method="post">
            用户ID: <input type="text" name="userid">
            <input type="submit" value="登陆">
        </form>
    <%
        String userid = request.getParameter("userid");
        if(!(userid==null || "".equals(userid))){
            session.setAttribute("userid", userid);
            response.sendRedirect("list.jsp");
        }
    %>
    </body>
</html>