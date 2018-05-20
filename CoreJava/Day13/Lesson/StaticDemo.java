/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson13;

/**
 * static
 * 
 * @author smallyu
 * @version 1.0
 */
public class Person {
    static int age = 21;
    int grade = 3;

    public static void test() {
        // geade++
        new StaticDemo().grade++;

    }

    public static void main(String[] args) {
        test();
        System.out.println(StaticDemo.age);
        System.out.println(new StaticDemo().age);
        new StaticDemo().test();
        StaticDemo.test();
        // static int y = 90;
    }
}