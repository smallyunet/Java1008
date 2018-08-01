package com.ychs.lesson.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtil2 {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");
    }

    public static void main(String[] args) {
        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }

    /**
     * 获取连接对象
     * @return Connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 1. 注册驱动
            Class.forName(driver);
            // 2. 获取连接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
            conn = DriverManager.getConnection(url, username, password);
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
