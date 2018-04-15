/*
 * @(#) Task2.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 从控制台输入学员王浩3门课程成绩，编写程序实现：
 * (1) Java课和SQL课的分数之差；
 * (2) 3门课的平均分.
 * @author smallyu
 * @version 1.0
 */
public class Task2 {
    public static void main(String[] args) {
        double stb;
        double java;
        double sql;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入王浩STB课程的成绩：");
        stb = sc.nextDouble();
        System.out.println("请输入王浩Java课程的成绩：");
        java = sc.nextDouble();
        System.out.println("请输入王浩SQL课程的成绩：");
        sql = sc.nextDouble();
        System.out.println("Java课和SQL课的成绩之差为："
            + (stb > java ? stb - java : java - stb)
        );
        System.out.println("3门课的平均分：" 
            + ((stb + java + sql) / 3)
        );
    }
}