package com.ychs.tasks.dao.impl;

import com.ychs.tasks.dao.IUserDAO;
import com.ychs.tasks.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserImpl implements IUserDAO {

    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public UserImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean findOne(String username, String password) {
        String sql = "SELECT count(*) FROM user WHERE username=\"" + username + "\" AND password=\"" + password + "\"";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = this.pstmt.executeQuery();
            while (rs.next()) {
                if(rs.getInt(1) > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addUser(String username, String password, Integer auth) {
        String sql = "INSERT INTO user(username, password, auth) VALUES(\"" + username +"\",\"" + password + "\",\"" + auth +"\")";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            int rs = this.pstmt.executeUpdate();
            if (rs > 0) {
                return true;
            }
        } catch (SQLException e) {
//            e.printStackTrace();
            System.out.println("用户名已存在！");
        }
        return false;
    }
}
