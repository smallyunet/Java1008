/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 我想买车，买什么车决定于我在银行有多少存款
 * 如果我的存款超过500万，我就买凯迪拉克
 * 否则，如果我的存款超过100万，我就买帕萨特
 * 否则， 如果我的存款超过50万，我就买依兰特
 * 否则， 如果我的存款超过10万，我就买奥托
 * 否则， 如果我的存款10万以下 ，我买捷安特
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("请输入银行存款（万）：");
        String flag = new Task7().result(new java.util.Scanner(System.in).nextInt());
        System.out.println("您应该买的车型为：" + flag);
    }
    
    /** 
     * 返回结果
     * @param balance 银行存款
     */
    public String result (int balance) {
       if (balance >= 500) {
            return "凯迪拉克";
       } else if (balance >= 100) {
            return "帕萨特";
        } else if (balance >= 50) {
            return "依兰特";
        } else if (balance >= 10) {
            return "奥托";
        } else {
            return "捷安特";
        }
    }
}
