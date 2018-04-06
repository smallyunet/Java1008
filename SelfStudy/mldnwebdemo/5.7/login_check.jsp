<%@ page contentType="text/html" pageEncoding="UTF8" %>
<%@ page import="java.sql.*"%>
<html>
<head>
<title>www</title>
</head>
<body>
<%!
    // 定义驱动
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    // 数据库地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/mldn?useUnicode=true&characterEncoding=utf-8";
    public static final String DBUSER = "root";
    public static final String DBPASS = "root";
%>
<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    boolean flag = false;
    String name = null;
%>
<%
try {
    
    Class.forName(DBDRIVER);
    conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
    String sql = "select name from user where userid=? and password=?";
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1,request.getParameter("id"));
    pstmt.setString(2,request.getParameter("password"));
    rs = pstmt.executeQuery();
    if(rs.next()){
        name = rs.getString(1);
        flag = true;
    }
    
} catch(Exception e) {
    out.println(e);
}
finally {
    try{
        rs.close();
        pstmt.close();
        conn.close();
    } catch(Exception e) {}
}
%>
<%
    if(flag){
%>
    <jsp:forward page="login_success.jsp">
        <jsp:param name="uname" value="<%=name%>"/>
    </jsp:forward>
<%
    } else {
%>
    <jsp:forward page="login_failure.htm"/>
<%
    }
%>
</body>
</html>