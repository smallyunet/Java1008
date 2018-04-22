/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 按照标准，结算折后购物金额
 *
 * @author smallyu
 * @version 1.0
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println("输入积分数量：");
        new Task11().result(new java.util.Scanner(System.in).nextInt());
    }

    /**
     * 输出结果
     * @param score 积分数量
     */
    public void result(int score) {
        switch (score / 1000) {
            case 0:
            case 1:
                System.out.println("9折");
                break;
            case 2:
            case 3:
                System.out.println("8折");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("7折");
                break;
            case 8:
                System.out.println("6折");
            default:
                System.out.println("不打折");
                break;
        }
    }
}
