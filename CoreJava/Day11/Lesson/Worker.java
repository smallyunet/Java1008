/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * Worder.java
 * 
 * @author smallyu
 * @version 1.0
 */
class Person {
    public Person() {
        System.out.println("111");
    }
}
class Teacher extends Person {
    public Teacher() {
        System.out.println("222");
    }
}
class Professor extends Teacher {
    public Professor() {
        System.out.println("333");
    }
    public static void main(String[] args) {
        new Professor();
    }
}