package com.ychs.lesson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 事务，手动提交
 */
public class TransactionDemo {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        conn = DBUtil.getConnection();
//        String sql = "INSERT INTO user(username, password, auth) VALUES(\"lesson1\", \"lesson1\", 3)";
        String sql2 = "INSERT INTO user(username, password, auth) VALUES(?, ?, ?)";

        String sql3 = "INSERT INTO user(username, password, auth) VALUES(\"lesson9\", \"lesson1\", 3)";
        String sql4 = "INSERT INTO user(username, password, auth) VALUES(\"lesson10\", \"lesson1\", 3)";

        // 手动开启事务
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql2);
//            pstmt2 = conn.prepareStatement(sql2);
//            int rs = pstmt.executeUpdate();
//            Statement st = conn.createStatement();
//            st.addBatch(sql2);
//            st.addBatch(sql3);
//            st.addBatch(sql4);
//            int[] res = st.executeBatch();
//            for (int i : res) {
//                System.out.println(i);
//            }
            pstmt.setString(1,"lesson8");
            pstmt.setString(2,"lesson8");
            pstmt.setInt(3,3);
            pstmt.addBatch();

            pstmt.setString(1,"lesson9");
            pstmt.setString(2,"lesson9");
            pstmt.setInt(3,3);
            pstmt.addBatch();

            pstmt.executeBatch();

            conn.commit();
//            System.out.println(rs);
        } catch (SQLException e) {
            try {
                System.out.println("异常，回滚");
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
//            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(conn, pstmt, null);
        }
    }
}
