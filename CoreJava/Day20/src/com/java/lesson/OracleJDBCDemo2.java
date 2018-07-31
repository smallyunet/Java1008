package com.java.lesson;

import java.sql.*;

public class OracleJDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
//        Statement stat = null;
        PreparedStatement ps = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test","scott","scott");
//            String sql = "SELECT * FROM emp";
//            stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery(sql);

            String sql = "insert into emp(empno, ename) values(?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, 456);
            ps.setString(2, "asdf");

            int r = ps.executeUpdate();

            System.out.println(r);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ps.close();
            conn.close();
        }
    }
}
