package com.ychs.test;


import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolingDataSource;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
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
        ConnectionFactory connectionFactory
                = new DriverManagerConnectionFactory(connectURI, null);
        PoolableConnectionFactory poolableConnectionFactory
                = new PoolableConnectionFactory(connectionFactory, null);
        ObjectPool<PoolableConnection> connectionPool
                = new GenericObjectPool<PoolableConnection>(poolableConnectionFactory);
        poolableConnectionFactory.setPool(connectionPool);
        PoolingDataSource<PoolableConnection> dataSource = new PoolingDataSource(connectionPool);
        return dataSource;
    }
}
