/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛，根据性别分别进入男子组和女子组
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("您的赛跑成绩为：");
        new Task8().result(new java.util.Scanner(System.in).nextInt());
    }
    /**
     * 输出结果
     * @param time 赛跑成绩
     */
    public void result(int time) {
        if (time > 10) {
            System.out.println("你没有资格进决赛");
        } else {
            System.out.println("你有资格进决赛");
        }
    }
}
