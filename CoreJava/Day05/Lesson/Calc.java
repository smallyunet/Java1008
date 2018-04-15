/*
 * @(#) Calc.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava

/**
 * 算数运算符
 * @author smallyu
 * @version 1.0
 */
public class Calc {
    public static void main(String[] args) {
        int num1 =15;
        int num2 = 4;
        System.out.println(3 + 2 + "tit");
        System.out.println(3 + "tit" + 2);
        System.out.println("tit" + 2 + 3);
        String str1 = 23 + "";
        //-------------------------
        System.out.println(3 / 2);  // 1
        System.out.println(3.0 / 2);  // 1.5
        System.out.println(-3.0 / 2);  // -1.5
        System.out.println(2 / 3);  // 0
        System.out.println(2.0 / 0);  // infinity
        System.out.println(2 / 0);  // 报错
        System.out.println(2.0 / 3);  // --
        //-------------------------
        System.out.println(2.0 % 0);    // NaN
        System.out.println(2 % 0);    // 报错
        //-------------------------
        int num1 = 15;
        int n1 = num1++;
        System.out.println(n1); // 15
        int n2 = ++num1;
        System.out.println(n2); // 17
      }
}