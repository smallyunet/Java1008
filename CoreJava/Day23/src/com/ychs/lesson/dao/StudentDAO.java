package com.ychs.lesson.dao;

import com.ychs.lesson.bean.ClassInfo;
import com.ychs.lesson.bean.Student;
import com.ychs.lesson.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    @Test
    public void getStudent() throws SQLException {
        QueryRunner qr = new QueryRunner(DBUtil.getDataSoutce());
        String sql = "SELECT s.id, s.name, s.gender, s.addr, s.cno, c.name as cname FROM t_student s LEFT JOIN class c ON s.cno = c.id";

        List<Student> students = qr.query(sql, rs -> {
            List<Student> list = new ArrayList<>();
            while(rs.next()) {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setGender(rs.getString("gender"));

                ClassInfo classInfo = new ClassInfo();
                classInfo.setId(rs.getInt("cno"));
                classInfo.setName(rs.getString("cname"));

                stu.setClassInfo(classInfo);
                list.add(stu);
            }
            return list;
        });

        System.out.println(students);
    }
}
