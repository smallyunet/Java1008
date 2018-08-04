package com.ychs.lesson.test;

import com.ychs.lesson.bean.ClassInfo;
import com.ychs.lesson.util.DBUtil;
import javafx.beans.binding.ObjectExpression;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 结果集的处理类
 */
public class HandleDemo {

    /**
     * 结果集为Array
     */
    @Test
    public void ArrayHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT * FROM class";
        Object[] obj = qr.query(sql, new ArrayHandler());
        System.out.println(Arrays.toString(obj));
    }

    @Test
    public void ArrayListHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT * FROM class";
        List<Object[]> obj = qr.query(sql, new ArrayListHandler());
        for (Object[] o : obj) {
            System.out.println(Arrays.toString(o));
        }
    }

    @Test
    public void ColumnListHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT name FROM class";
        Object obj = qr.query(sql, new ColumnListHandler<ClassInfo>());
        System.out.println(obj);
    }

    @Test
    public void ScalarHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT count(*) FROM class";
        Long obj = qr.query(sql, new ScalarHandler<>());
        System.out.println(obj);
    }

    @Test
    public void MapHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT * FROM class";
        Map<String, Object> obj = qr.query(sql, new MapHandler());
        System.out.println(obj);
    }

    @Test
    public void MapListHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT * FROM class";
        List<Map<String, Object>> obj = qr.query(sql, new MapListHandler());
        System.out.println(obj);
    }

    @Test
    public void KeyedHandleFun() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT * FROM class";
        Object obj= qr.query(sql, new KeyedHandler());
        System.out.println(obj);
    }
}
