package com.ychs.lesson;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 自定义连接池
 */
public class MyConnection {
    private static LinkedList<Connection> pools = new LinkedList<>();

    static {
        initPools();
    }

    public static void initPools() {
        for (int i = 0; i < 3; i++) {
            Connection conn = com.ychs.lesson.DBUtil.getConnection();
            pools.addLast(conn);
        }
    }

    public static Connection getConnection() {
        if (pools.isEmpty()) {
            initPools();
        }
        return pools.removeFirst();
    }

    public static void closeConnection(Connection conn) {
        pools.addLast(conn);
    }

    public static void main(String[] args) {
        Connection conn1 = MyConnection.getConnection();
        Connection conn2 = MyConnection.getConnection();
        Connection conn3 = MyConnection.getConnection();
        Connection conn4 = MyConnection.getConnection();
        System.out.println(conn1);
        System.out.println(conn2);
        System.out.println(conn3);
        System.out.println(conn4);
        MyConnection.closeConnection(conn1);
        MyConnection.closeConnection(conn2);
        MyConnection.closeConnection(conn3);
        MyConnection.closeConnection(conn4);
        conn1 = MyConnection.getConnection();
        conn2 = MyConnection.getConnection();
        conn3 = MyConnection.getConnection();
        conn4 = MyConnection.getConnection();
        System.out.println(conn1);
        System.out.println(conn2);
        System.out.println(conn3);
        System.out.println(conn4);
    }
}
