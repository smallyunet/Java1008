package com.ychs.lesson;

import com.ychs.lesson.util.DBUtil2;
import oracle.jdbc.OracleTypes;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 调用存储过程
 */
public class ProcedureDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil2.getConnection();
        // 1. SQL
        String sql = "{call getSalByEmpno(?,?)}";
        // 2. 获取CallableStatement
        java.sql.CallableStatement pc = conn.prepareCall(sql);
        // 3. 设置参数
        pc.setInt(1, 7499);
        pc.registerOutParameter(2, OracleTypes.NUMBER);
        // 4. 执行
        pc.execute();
        // 5. 结果
        Object obj = pc.getObject(2);
        DBUtil2.closeConnection(conn, pc, null);

        System.out.println(obj);
    }
}
