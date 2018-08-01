package com.ychs.lesson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 通过properties读取配置
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        // 加载属性文件
        prop.load(new FileInputStream("src/db.properties"));

        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
}
