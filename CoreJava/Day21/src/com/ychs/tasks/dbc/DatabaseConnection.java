/*
    2018 copyright
 */

package com.ychs.tasks.dbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接类
 * @author smallyu
 */
public class DatabaseConnection {

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    private static Connection conn;

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

    public DatabaseConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return
     */
    public Connection getConnection() {
        return this.conn;
    }

    /**
     * 关闭数据库连接对象
     */
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
