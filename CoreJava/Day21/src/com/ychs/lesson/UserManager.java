package com.ychs.lesson;

import com.ychs.lesson.util.DBUtil;

import java.sql.*;

public class UserManager {
    public static void main(String[] args){
        new UserManager().getUser();
    }

    /**
     * 分页
     */
    public void getUser() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int page = 1;
        int pageCount = 3;
        try {
            conn = DBUtil.getConnection();
            // 3. 编写SQL
            String sql = "SELECT u.* " +
                    "FROM (SELECT e.*, rownum rn " +
                    "FROM (SELECT * FROM emp ORDER BY empno DESC) e) u " +
                    "WHERE u.rn > ? AND u.rn < ?";
            // 4. 获取操作对象
            ps = conn.prepareStatement(sql);
            // 5. 设置参数
            // 页码 条数
            int prevRownum = (page - 1) * pageCount;
            int nextRownum = page * pageCount;
            ps.setInt(1, prevRownum);
            ps.setInt(2, nextRownum);
            // 6. 执行SQL
            rs = ps.executeQuery();
            // 7. 结果集处理
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " --- " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(conn, ps, rs);
        }
    }

    /**
     * 普通查询
     * @throws SQLException
     */
    public void oldGetUser() throws SQLException  {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            // 3. 编写SQL
            String sql = "SELECT * FROM emp";
            // 4. 获取操作对象
            ps = conn.prepareStatement(sql);
            // 5. 设置参数
            // 6. 执行SQL
            rs = ps.executeQuery();
            // 7. 结果集处理
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " --- " + rs.getString(2));
            }
        } finally {
            DBUtil.closeConnection(conn, ps, rs);
        }
    }
}
