/*
 * ychs版权所有
 */

package com.ychs168.corejava;

/**
 * 控制台接收张浩的 Java 成绩，如果张浩的Java考试成绩大于98分，张浩就能获得一个MP4作为奖励
 * 
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("请输入java成绩：");
        int javaScore = new java.util.Scanner(System.in).nextInt();
        System.out.println("请输入music成绩：");
        int musicScore = new java.util.Scanner(System.in).nextInt();
        if ((javaScore > 98 && musicScore > 80) || (javaScore > 100 && musicScore > 70)) {
            System.out.println("张浩可以获得奖励");
        } else {
            System.out.println("张浩不可以获得奖励");
        }
    }
}