/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson14;

import java.util.*;

/**
 * 异常
 * 
 * @author smallyu
 * @version 1.0
 */
public class Calc {
    public double div(int a, int b) {
        double c = 0;
        try {
            c = a / b;
            System.out.println("ddd");
        } catch (Exception e) {
            System.out.println("除数不能为空");
        }
        return 0;
    }
    public static void main(String[] args) {
        Calc cx = new Calc();
        cx.div(3,2);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int first = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int second = sc.nextInt();
        System.out.println(cs.div(first, second));
    } 
}