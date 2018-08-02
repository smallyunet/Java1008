package com.ychs.lesson;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DbcpDemo {

    private static String driverClassName = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/com/ychs/lesson/db.properties"));
            driverClassName = prop.getProperty("driverClassName");
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/com/ychs/lesson/db.properties"));
            DataSource ds = BasicDataSourceFactory.createDataSource(prop);
            System.out.println(ds.getConnection());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setInitialSize(5);
        try {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
