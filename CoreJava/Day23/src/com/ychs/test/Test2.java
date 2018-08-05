package com.ychs.test;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = setupDataSource("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            rset = stmt.executeQuery("SELECT * FROM user");
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " --- " + rset.getString(2));
            }
        }finally {
            rset.close();
            stmt.close();
            conn.close();
        }
    }

    public static DataSource setupDataSource(String connectURI) {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl(connectURI);
        return ds;
    }
}
