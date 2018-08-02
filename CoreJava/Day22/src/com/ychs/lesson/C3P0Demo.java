package com.ychs.lesson;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo {
    public static void main(String[] args) {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        try {
//            cpds.setDriverClass("com.mysql.jdbc.Driver");
//            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc");
//            cpds.setUser("root");
//            cpds.setPassword("root");
//            Connection conn = cpds.getConnection();
//            System.out.println(conn);
            System.out.println(cpds.getConnection());
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
