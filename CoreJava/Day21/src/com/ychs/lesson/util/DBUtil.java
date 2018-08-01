package com.ychs.lesson.util;

import java.sql.*;

/**
 * Oracle的工具类
 * @author smallyu
 */
public class DBUtil {
    /**
     * 获取连接对象
     * @return Connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test", "scott", "scott");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭连接
     * @param conn
     * @param stat
     * @param rs
     */
    public static void closeConnection(Connection conn, Statement stat, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
