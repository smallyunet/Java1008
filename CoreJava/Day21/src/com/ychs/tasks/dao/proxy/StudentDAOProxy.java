/*
    2018 copyright
 */

package com.ychs.tasks.dao.proxy;

import com.ychs.tasks.dao.IStudentDAO;
import com.ychs.tasks.dao.impl.StudentImpl;
import com.ychs.tasks.dbc.DatabaseConnection;
import com.ychs.tasks.vo.Student;

import java.util.List;

/**
 * 代理主题实现类
 */
public class StudentDAOProxy implements IStudentDAO {

    private DatabaseConnection dbc = null;
    private IStudentDAO dao = null;

    public StudentDAOProxy() {
        this.dbc = new DatabaseConnection();
        this.dao = new StudentImpl(this.dbc.getConnection());
    }

    @Override
    public List<Student> findByPage(Integer currPage, Integer pageCount) {
        List<Student> all = null;
        all = this.dao.findByPage(currPage, pageCount);
        return all;
    }

    @Override
    public Integer findItemsCount() {
        Integer itemsCount = 0;
        itemsCount = this.dao.findItemsCount();
        return itemsCount;
    }
}
