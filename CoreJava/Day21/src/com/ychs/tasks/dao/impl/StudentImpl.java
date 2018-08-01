/*
    2018 copyright
 */

package com.ychs.tasks.dao.impl;

import com.ychs.tasks.dao.IStudentDAO;
import com.ychs.tasks.vo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Student实现类
 */
public class StudentImpl implements IStudentDAO {

    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public StudentImpl(Connection conn) {
        this.conn = conn;
    }

    /**
     * 查询数据
     * @param currPage 当前页数
     * @param pageNum 每页条数
     * @return Student对象集合
     */
    @Override
    public List<Student> findByPage(Integer currPage, Integer pageNum) {
        Integer startNum = currPage * pageNum;
        List<Student> all = new ArrayList();
        String sql = "SELECT id,name,gender,class,teacher FROM student ORDER BY id LIMIT ?, ?";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setInt(1, startNum);
            this.pstmt.setInt(2, pageNum);
            ResultSet rs = this.pstmt.executeQuery();
            Student student = null;
            while(rs.next()) {
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setGender(rs.getString(3));
                student.setClassNo(rs.getString(4));
                student.setTeacher(rs.getString(5));
                all.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }

    @Override
    public Integer findItemsCount() {
        Integer itemsCount = 0;
        String sql = "SELECT count(*) FROM student";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                itemsCount = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemsCount;
    }
}
