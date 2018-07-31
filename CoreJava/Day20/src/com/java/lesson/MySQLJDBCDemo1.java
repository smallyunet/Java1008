package com.java.lesson;

import java.sql.*;

public class MySQLJDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stat = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
            // sql语句
            String sql = "SELECT * FROM t_user";
            // 创建操作对象
            stat = conn.createStatement();
            // 返回结果集
            ResultSet rs = stat.executeQuery(sql);
            // 遍历结果集
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " --> " + rs.getString(2));
            }

            // 插入数据
            String sql2;
            for (int i = 0; i < 10; ++i) {
                sql2 = "INSERT INTO t_user(user_name, password) VALUES (\"user_" + i +"\", \"password\")";
                System.out.println(stat.executeUpdate(sql2));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            stat.close();
            conn.close();
        }
    }
}
