/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * 人类
 * 
 * @author smallyu
 * @version 1.0
 */
public class Person {
    String name;
    String sex;
    private int salary;

    public Person() {
    }

    private Person() {
        name = n;
        sex = s;
        salary = sal;
    }

    public void say(int x) {
        // private int age = 19;
    }

    private void add() {
    }
}

class Student extends Person {
    int grade;

    public static void main(String[] args) {
        System.out.println(new Student().salary);
    }
}

private class WorkerP {
}