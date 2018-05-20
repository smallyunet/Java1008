/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson13;

/**
 * final
 * 
 * @author smallyu
 * @version 1.0
 */
public class Person {
    final int age = 21;
    public Person(int age){
        this.age = age;
    }
    public static void main(String[] args){
        final int x = 100;
        final String y = "abc";
        // y = "123";
    }
    public void say(final int x) {}
}