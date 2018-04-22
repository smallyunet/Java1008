/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 输入消费金额选择优惠
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
        Task14 ts14 = new Task14();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入消费金额：");
        int money = sc.nextInt();
        ts14.info();
        System.out.print("请选择：");
        int flag = sc.nextInt();

        ts14.result(money, flag);
    }

    /**
     * 输出提示信息
     */
    public void info() {
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1. 满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2. 满100元，加3元换购500ml可乐一瓶");
        System.out.println("3. 满100元，加10元换购5公斤面粉");
        System.out.println("4. 满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5. 满200元，加20元可换购欧莱雅爽肤水一瓶");
        System.out.println("0. 不换购");
    }

    /**
     * 判断结果
     * @param money 消费金额
     * @param flag 选择换购类型
     */
    public void result(int money, int flag) {
        switch (flag) {
        case 1:
            System.out.println("本次消费总金额：" + (money + 2));
            System.out.println("成功换购：百事可乐饮料1瓶");
            break;
        case 2:
            System.out.println("本次消费总金额：" + (money + 3));
            System.out.println("成功换购：500ml可乐一瓶");
            break;
        case 3:
            System.out.println("本次消费总金额：" + (money + 10));
            System.out.println("成功换购：5公斤面粉");
            break;
        case 4:
            System.out.println("本次消费总金额：" + (money + 10));
            System.out.println("成功换购：1个苏泊尔炒菜锅");
            break;
        case 5:
            System.out.println("本次消费总金额：" + (money + 20));
            System.out.println("成功换购：欧莱雅爽肤水一瓶");
            break;
        case 0:
            System.out.println("本次消费总金额：" + money);
            System.out.println("不换购");
            break;
        default:
            System.out.println("本次消费总金额：" + money);
            System.out.println("不换购");
            break;
        }
    }
}
