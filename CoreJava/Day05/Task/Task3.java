/*
 * @(#) Task3.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

/**
 * 根据天数（46）计算周数和剩余的天数（开发时间：10分钟）
 * @author smallyu
 * @version 1.0
 */
public class Task3 {
    public static void main(String[] args) {
        int days = 46;
        System.out.println("一共" +days / 7 + "周零"+ days % 7 + "天");
    }
}