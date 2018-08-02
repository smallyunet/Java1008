package com.ychs.lesson;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBCPUtil {

    private static Properties prop = null;
    private static DataSource ds = null;

    static {
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/com/ychs/lesson/db.properties"));
            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据源
     * @return
     */
    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
