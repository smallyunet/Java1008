/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 抽奖活动，控制台接收4位数会员号，会员号的百位数字等于产生的随机数字即为幸运会员
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("请输入会员号：");
        new Task5().award(new java.util.Scanner(System.in).nextInt());
    }
    
    /**
     * 判断是否是幸运会员
     * @param result 会员号
     */
    public void award (int result) {
        int flag = ((int) Math.random()) * 10;    // [0, 1) * 10 = [0, 10)
        if (flag == result / 100) {
            System.out.println("您是幸运会员");
        } else {
            System.out.println("您不是幸运会员");
        }
    }
}
