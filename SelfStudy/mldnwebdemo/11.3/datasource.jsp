<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.sql.*" %>
<html>
<head>
<title>java web</title>
</head>
<body>
<%
    String DSNAME = "java:comp/env/jdbc/mldn";
    Context ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup(DSNAME);
    Connection conn = ds.getConnection();
%>
<%=conn%>
<%
    conn.close();
%>
</body>
</html>