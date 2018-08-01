package com.ychs.tasks.factory;

import com.ychs.tasks.dao.IStudentDAO;
import com.ychs.tasks.dao.IUserDAO;
import com.ychs.tasks.dao.proxy.StudentDAOProxy;
import com.ychs.tasks.dao.proxy.UserDAOProxy;

/**
 * 工厂类，返回DAO对象
 */
public class DAOFactory {
    public static IStudentDAO getStudentDAOInstance() {
        return new StudentDAOProxy();
    }

    public static IUserDAO getUserDAOInstance() {
        return new UserDAOProxy();
    }
}
