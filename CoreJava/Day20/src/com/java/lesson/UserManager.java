package com.java.lesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserManager {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stat = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库的连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
            // 3. sql
            String sql = "INSERT INTO t_user(user_name, password) VALUES(\"user666\", \"password666\")";
            // 4. 操作对象
            stat = conn.createStatement();
            // 5. 执行
            int r = stat.executeUpdate(sql);
            // 6. 结果
            System.out.println(r);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            stat.close();
            conn.close();
        }
    }
}
