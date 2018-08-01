package com.ychs.tasks.dao;

import com.ychs.tasks.vo.User;

/**
 * User接口
 */
public interface IUserDAO {
    public boolean findOne(String username, String password);
    public boolean addUser(String username, String password, Integer auth);
}
