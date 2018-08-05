package com.ychs.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();

        cpds.setDriverClass( "com.mysql.jdbc.Driver" );
        cpds.setJdbcUrl( "jdbc:mysql://localhost:3306/jdbc" );
        cpds.setUser("root");
        cpds.setPassword("root");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            conn = cpds.getConnection();
            stmt = conn.createStatement();
            rset = stmt.executeQuery("SELECT * FROM user");
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " --- " + rset.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rset.close();
            stmt.close();
            conn.close();
            cpds.close();
        }
    }
}
