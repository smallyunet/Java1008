package com.ychs.tasks.dao.proxy;

import com.ychs.tasks.dao.IUserDAO;
import com.ychs.tasks.dao.impl.UserImpl;
import com.ychs.tasks.dbc.DatabaseConnection;

public class UserDAOProxy implements IUserDAO {

    private DatabaseConnection dbc = null;
    private IUserDAO dao = null;

    public UserDAOProxy() {
        dbc = new DatabaseConnection();
        dao = new UserImpl(dbc.getConnection());
    }

    @Override
    public boolean findOne(String username, String password) {
        return this.dao.findOne(username, password);
    }

    @Override
    public boolean addUser(String username, String password, Integer auth) {
        return this.dao.addUser(username, password, auth);
    }
}
