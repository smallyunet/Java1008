/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 控制台接收名次，根据名次的不同给予不同奖励，
 * 第一名：参加麻省理工大学组织的1个月夏令营
 * 第二名：奖励惠普笔记本电脑一部
 * 第三名：奖励移动硬盘一个
 * 其他：没有任何奖励 
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println("输入名次：");
        new Task12().result(new java.util.Scanner(System.in).nextInt());
    }

    /**
     * 输出结果
     * @param score 名次
     */
    public void result(int score) {
        switch (score) {
            case 1:
                System.out.println("参加麻省理工大学组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("没有任何奖励");
                break;
        }
    }
}
