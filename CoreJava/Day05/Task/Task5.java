/*
 * @(#) Task5.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 从控制台输入张三同学的成绩，与李四的成绩（80分）比高低
 * @author smallyu
 * @version 1.0
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int scores = sc.nextInt();
        System.out.println("张三的成绩比李四的成绩" + (scores > 80 ? "高" : "低"));
    }
}