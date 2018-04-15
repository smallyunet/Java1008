/*
 * @(#) Task8.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 输入四位会员号，各位数字之和大于20为幸运顾客
 * @author smallyu
 * @version 1.0
 */
public class Task8 {
    public static void main(String[] args) {
        int shirt = 150;
        int shoes = 120;
        int racket = 130;
        System.out.println("请输入折扣：");
        double discount = new Scanner(System.in).nextDouble();
        System.out.println("衬衫的价格低于100吗？" + (shirt * discount < 100));
        System.out.println("网球鞋的价格低于100吗？" + (shoes * discount < 100));
        System.out.println("网球拍的价格低于100吗？" + (racket * discount < 100));
    }
}