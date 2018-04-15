/*
 * @(#) Task9.java 2018-04-15
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

package com.ychs168.corejava;

import java.util.Scanner;

/**
 * 结算是时打印购物小票计算此次购物获得的会员积分
 * @author smallyu
 * @version 1.0
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println("以下为小票输出样例：\n");
        new Task9().demo();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("接下来请根据提示输入自定义数据：");
        System.out.println("您购买T恤的数量：");
        int shirt = sc.nextInt();
        System.out.println("您购买网球鞋的数量：");
        int shoes = sc.nextInt();
        System.out.println("您购买网球拍的数量：");
        int racket = sc.nextInt();
        System.out.println("您付款金额为：");
        int money = sc.nextInt();

        new Task9().print(shirt, shoes, racket, money);
    }
    /**
     * 样例输出
     */
    public void demo() {
        System.out.printf("%-40s\n", "××××××××*消费单*××××××××");
        System.out.printf("%-9s%-10s%-10s%-10s\n", "购买物品", "单价", "个数", "金额");
        System.out.printf("%-12s%-10s%-10s%-10s\n", "T恤", "￥245", "2", "￥490");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "网球鞋", "￥570", "1", "￥570");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "网球拍", "￥320", "1", "￥320");
        System.out.printf("\n");
        System.out.printf("%-20s%-20s\n", "折扣", "8折");
        System.out.printf("%-17s%-20s\n", "消费总金额", "￥1104.0");
        System.out.printf("%-18s%-20s\n", "实际交费", "$1500");
        System.out.printf("%-20s%-20s\n", "找零", "￥396.0");
        System.out.printf("%s%d\n", "本次购物所获得的积分是: ￥", 33);
    }
    /**
     * @param shirt 衬衫数量
     * @param shoes 网球鞋数量
     * @param racket 网球拍数量
     * @param money 交钱总数
     */
    public void print(int shirt, int shoes, int racket, int money) {
        System.out.printf("%-40s\n", "××××××××*消费单*××××××××");
        System.out.printf("%-9s%-10s%-10s%-10s\n", "购买物品", "单价", "个数", "金额");
        System.out.printf("%-12s%-10s%-10s%-10s\n", "T恤", "￥245", shirt, "￥" + (245 * shirt));
        System.out.printf("%-10s%-10s%-10s%-10s\n", "网球鞋", "￥570", shoes, "￥" + (570 * shoes));
        System.out.printf("%-10s%-10s%-10s%-10s\n", "网球拍", "￥320", racket, "￥" + (320 * racket));
        System.out.printf("\n");
        System.out.printf("%-20s%-20s\n", "折扣", "8折");
        System.out.printf("%-17s%-20s\n", "消费总金额", "￥" + (245 * shirt + 570 * shoes + 320 * racket));
        System.out.printf("%-18s%-20s\n", "实际交费", "￥" + money);
        System.out.printf("%-20s%-20s\n", "找零", "￥" + (245 * shirt + 570 * shoes + 320 * racket - money));
        System.out.printf("%s%d\n", "本次购物所获得的积分是: ", (245 * shirt + 570 * shoes + 320 * racket) / 100);
    }
}