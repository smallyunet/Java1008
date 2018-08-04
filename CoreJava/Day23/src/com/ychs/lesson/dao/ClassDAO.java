package com.ychs.lesson.dao;

import com.ychs.lesson.bean.ClassInfo;
import com.ychs.lesson.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 对班级的操作
 */
public class ClassDAO {

    /**
     * 通过name插入班级表
     * @return
     */
    public int insertClassByName (ClassInfo classInfo) {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        int res = 0;
        String sql = "INSERT INTO class(name) VALUES(?)";
        try {
            res = qr.update(sql, new Object[]{classInfo.getName()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 通过id和name插入班级表
     * @return
     */
    public int insertClass (ClassInfo classInfo) {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        int res = 0;
        String sql = "INSERT INTO class(id, name) VALUES(?, ?)";
        try {
            res = qr.update(sql, new Object[]{classInfo.getId(), classInfo.getName()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 查询班级列表
     * @return
     */
    public ClassInfo getClassById() {
        ClassInfo classes = null;
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT id, name FROM class WHERE id=1";
        try {
            classes = qr.query(sql, new BeanHandler<ClassInfo>(ClassInfo.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classes;
    }

    /**
     * 查询班级列表
     * @return
     */
    public List<ClassInfo> getClassList() {
        List<ClassInfo> classes = null;
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT id, name FROM class";
        try {
            classes = qr.query(sql, new BeanListHandler<ClassInfo>(ClassInfo.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classes;
    }

}







