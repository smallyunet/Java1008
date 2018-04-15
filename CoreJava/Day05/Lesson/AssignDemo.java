/*
 * @(#)AssignDemo.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */
package com.ychs168.corejava;

/**
 * 赋值运算符演示
 * @author smallyu
 * @version 1.0
 */
public class AssignDemo {
    public static void main(String[] args) {
        // byte num1 = 230;    // 超过范围
        // int num2 = 8.9;     // 高级类型到低级类型不会自动转换
        // float num3 = 9.8;   // 类型不一致。加f
        char c1 = 90;   // 可以
        char c2 = 'x';  
        char c3 = '\n';     // 转义字符
        char c4 = '\u0034';     // unicode
        double d1 = 3.;     // 可行
        double d2 = .314;   // 可行
        // System.out.println("""");   // 出错
        System.out.println("123\n");
        System.out.println("\"\""); // 转义
        short num4 = 8;     // 不会出错
        // boolean flag = 10;  // 不行
        // String name = '';   // 不行
        // String name = '111';   // 也不行
        // short num5 = num4 + 1;      // 出错了，右侧为整型
        // System.out.println(num5);
    }
}

