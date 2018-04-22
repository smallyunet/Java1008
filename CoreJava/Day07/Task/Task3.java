/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 控制台接收 Java 成绩
 * 如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，否则老师就罚他进行编码
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("请输入java成绩：");
        new Task3().award(new java.util.Scanner(System.in).nextInt());
    }

    /**
     * 根据成绩判断 奖励还是惩罚
     * @param score java成绩
     */
    public void award(int score) {
        if (score > 98) {
            System.out.println("老师奖励一个MP4");
        } else {
            System.out.println("老师惩罚进行编码");
        }
    }
}
