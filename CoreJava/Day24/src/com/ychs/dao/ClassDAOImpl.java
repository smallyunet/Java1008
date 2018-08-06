package com.ychs.dao;

import com.ychs.bean.ClassInfo;
import com.ychs.dao.inter.IClassDAO;
import com.ychs.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassDAOImpl implements IClassDAO {
    @Override
    public int insertClass(ClassInfo classInfo) {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "INSERT INTO class(name) VALUES (?)";
        int res = 0;
        try {
            res = qr.update(sql, new Object[] {classInfo.getName()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int updateClass(ClassInfo classInfo) {
        return 0;
    }

    @Override
    public int delClass(int id) {
        return 0;
    }

    @Override
    public List<ClassInfo> getClass(Map<String, Object> map) {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        StringBuffer sql = new StringBuffer("SELECT id, name FROM class WHERE 1=1");
        List params = new ArrayList();
        if (map.get("name") != null && !map.get("name").equals("")) {
            sql.append(" AND name like ?");
            params.add("%" + map.get("name") + "%");
        }
        List<ClassInfo> list = null;
        try {
            list = qr.query(sql.toString(), new BeanListHandler<>(ClassInfo.class), params.toArray());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
