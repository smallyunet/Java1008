/*
    2018 copyright
 */

package com.ychs.tasks.dao;

import com.ychs.tasks.vo.Student;

import java.util.List;

/**
 * Student接口
 */
public interface IStudentDAO {
    /**
     * 根据页数查询
     * @param currPage 当前页数
     * @param pageNum 每页条数
     * @return
     */
    public List<Student> findByPage(Integer currPage, Integer pageNum);

    /**
     * 查询数据条数
     * @return
     */
    public Integer findItemsCount();
}
