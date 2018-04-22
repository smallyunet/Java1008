/*
 * ychs版权所有
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 *  控制台接收张浩的 Java 成绩，音乐成绩。
 *  当张浩Java成绩大于98分，而且音乐成绩大于80分，老师奖励他；
 *  或者Java成绩等于100分，音乐成绩大于70分，老师也可以奖励他
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入java成绩：");
        int javaScore = sc.nextInt();
        System.out.println("请输入music成绩：");
        int musicScore = sc.nextInt();
        new Task2().award(javaScore, musicScore);
    }

    /**
     * 判断学生是否可以获得奖励
     */
    public void award(int javaScore, int musicScore) {
        if ((javaScore > 98 && musicScore > 80) || (javaScore > 100 && musicScore > 70)) {
            System.out.println("张浩可以获得奖励");
        } else {
            System.out.println("张浩不可以获得奖励");
        }
    }
}