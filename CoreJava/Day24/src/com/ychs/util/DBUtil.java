/*
    2018 copyright
 */

package com.ychs.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 数据库工具类
 *
 * @author smallyu
 */
public class DBUtil {
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    /**
     * 互殴数据源
     *
     * @return
     */
    public static DataSource getDataSoutce() {
        return ds;
    }

    /**
     * 获取连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(DBUtil.getConnection());
    }
}
