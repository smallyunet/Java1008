/*
 * ychs版权所有
 */
package com.ychs168.corejava;

/**
 * if语句语法示例
 * @author smallyu
 * @version 1.0 2018-04-22 
 */
public class IfDemo {
    public static void main(String[] args) {

        // if (true) 
        //     int age = 10;    // 报错

        int age;
        if (true)
            age = 20; // 正确的

        if (false);{ // 提前结束
            System.out.println(123);
            System.out.println(456);
        }

        if (true)
            System.out.println("Hello");
    }
}
