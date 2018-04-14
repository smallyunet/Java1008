/*
 * @(#)Operation.java 2018-04-14
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 基本运算操作类
 * @author smallyu
 * @version 1.0
 */
public class Operation {
    /**
     * main方法
     * @param args String[]
     */
    public static void main(String[] args) {
        // 初始化变量
        double o1 = 0;
        double o2 = 0;
        String symbol;
        double result;
        // 实例化Operation对象
        Scanner sc = new Scanner(System.in);
        // 接收第一个操作数
        System.out.println("输入第一个操作数：");
        o1 = sc.nextDouble();
        // 接受操作符
        System.out.println("输入操作符：");
        symbol = sc.next();
        // 接受第二个操作数
        System.out.println("输入第二个操作数：");
        o2 = sc.nextDouble();
        // 实例化Operation对象
        Operation op = new Operation();
        // 根据操作符匹配相应的操作
        switch (symbol) {
            case "+":
                result = op.add(o1, o2);
                break;
            case "-":
                result = op.minus(o1, o2);
                break;
            case "*":
                result = op.multiply(o1, o2);
                break;
            case "/":
                result = op.divide(o1, o2);
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("运算结果为：" + result);
    }

    /**
     * 加法运算
     * @param o1 第一个操作数
     * @param o2 第二个操作数
     * @return double
     */
    public double add(double o1, double o2) {
        return o1 + o2;
    }

    /**
     * 减法运算
     * @param o1 第一个操作数
     * @param o2 第二个操作数
     * @return double
     */
    public double minus(double o1, double o2) {
        return o1 - o2;
    }

    /**
     * 乘法运算
     * @param o1 第一个操作数
     * @param o2 第二个操作数
     * @return double
     */
    public double multiply(double o1, double o2) {
        return o1 * o2;
    }

    /**
     * 除法运算
     * @param o1 第一个操作数
     * @param o2 第二个操作数
     * @return double
     */
    public double divide(double o1, double o2) {
        return o1 / o2;
    }
}
