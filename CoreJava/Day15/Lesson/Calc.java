package com.ychs168.corejava.lesson15;

public class Calc {
    public double div(int a, int b) {
        double c = 0;
        try {
            c =a / b;
            System.out.println("123");
        } catch () {
            e.printStackTrace();
            System.out.println("除数不能为0！");
        } finally {
            System.out.println("一定要执行的！");
        }
    }
    public static void main(String[] args) {
        Cal cal = new Calc();
        double result = cal.div(3, 0);
        System.out.println(result);
    }
}