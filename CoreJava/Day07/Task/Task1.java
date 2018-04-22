/*
 * ychs版权所有
 */

package com.ychs168.corejava;

/**
 * 控制台接收张浩的 Java 成绩，如果张浩的Java考试成绩大于98分，张浩就能获得一个MP4作为奖励
 * 
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        int score = new java.util.Scanner(System.in).nextInt();
        System.out.println("张浩" + (score > 98 ? "能" : "不能") + "获得一个MP4作为奖励");
    }
}