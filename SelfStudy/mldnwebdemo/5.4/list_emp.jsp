<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.sql.*"%>
<html>
<head><title>高端培训</title></head>
<body>
<%!
    // 定义数据库驱动程序
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    // 数据库连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/mldn";
    public static final String DBUSER = "root";         // 数据库用户名
    public static final String DBPASS = "root";         // 数据库密码
%>
<%
    Connection conn = null;             // 数据库连接对象
    PreparedStatement pstmt = null;     // 数据库操作
    ResultSet rs = null;                // 数据库结果集
%>
<%
    try {
        Class.forName(DBDRIVER);    // 加载数据库驱动
        conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);    // 取数据库连接
        String sql = "SELECT empno,ename,job,sal,hiredate FROM emp";
        pstmt = conn.prepareStatement(sql); // 实例化prepareStatement
        rs = pstmt.executeQuery();  // 执行查询
%>
<center>
    <table border="1" width="80%">
        <tr>
            <td>雇员编号</td>
            <td>雇员姓名</td>
            <td>雇员工作</td>
            <td>雇员工资</td>
            <td>雇员日期</td>
        </tr>
<%
    while(rs.next()) {
        int empno = rs.getInt(1);
        String ename = rs.getString(2);
        String job = rs.getString(3);
        float sal = rs.getFloat(4);
        java.util.Date date = rs.getDate(5);
%>
        <tr>
            <td><%=empno%></td>
            <td><%=ename%></td>
            <td><%=job%></td>
            <td><%=sal%></td>
            <td><%=date%></td>
        </tr>
<%
    }
    } catch (Exception e) {
        out.println(e);
    } finally {
        rs.close();
        pstmt.close();
        conn.close();
    }
%>
    </table>
</center>
</body>
</html>