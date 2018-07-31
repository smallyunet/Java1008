package com.java.lesson;

import java.sql.*;

public class OracleJDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test","scott","scott");
            String sql = "SELECT * FROM emp";
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " ----- " +rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            stat.close();
            conn.close();
        }
    }
}
