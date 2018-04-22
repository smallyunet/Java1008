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
public class Task10 {
    public static void main(String[] args) {
        System.out.println("选择购物类型 [a: 满100元 b: 会员购物 c: 满200元]：");
        new Task10().result(new java.util.Scanner(System.in).nextLine());
    }

    /**
     * 输出结果
     * @param flag 购物类型
     */
    public void result(String flag) {
        switch (flag) {
            case "a":
                System.out.println("9折");
                break;
            case "b":
                System.out.println("8折");
                break;
            case "c":
                System.out.println("7.5折");
                break;
            default:
                System.out.println("不打折");
                break;
        }
    }
}
