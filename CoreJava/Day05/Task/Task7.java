/*
 * @(#) Task7.java 2018-04-15
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
public class Task7 {
    public static void main(String[] args) {
        int id = new Scanner(System.in).nextInt();
        int sum = id / 1000 + (id % 1000) / 100 + (id % 100) / 10 + id % 10;
        System.out.println("会员卡号的各位之和：" + sum);
        System.out.println("该会员 " + (sum > 20 ? "是" : "不是") + " 幸运客户");
    }
}