/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson13;

/**
 * @author smallyu
 * @version 1.0
 */
public class Teacher {
    static int age = 21;
    int grade;

    public Teacher(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher(30);
        Teacher t2 = new Teacher(35);
        Teacher.age = 100;
        t1.age = 90;
        System.out.println(t1.getAge());
        System.out.println(t2.getAge());
    }
}
