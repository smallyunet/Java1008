/*
 * @(#) Task4.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 用户输入秒数，输出X小时X分X秒   开发时间：10分钟
 * @author smallyu
 * @version 1.0
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();
        System.out.println((seconds / 3600) + "时" + ((seconds % 3600) / 60) + "分" + (seconds % 3600 % 60) + "秒");
    }
}