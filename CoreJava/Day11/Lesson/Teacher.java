/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * 教师类
 * 
 * @author smallyu
 * @version 1.0
 */
class Person {
    String name;
    public Person() {
        Systen.out.println("Person");
    }
    public Person(string n) {
        name = n;
        System.out.println("Person1111");
    }
}
public class Teacher extends Person {
    int tage;
    public Teacher() {
        System.out.println("Teacher");
    }
    public static void main(STring[] args) {
        Teacher t = new Teacher();
    }
}