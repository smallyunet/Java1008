/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * Animal.java
 * 
 * @author smallyu
 * @version 1.0
 */
public class Animal {
    String name;
    public Animal(String n) {
        name = n;
        System.out.println("1111");
    }
}
class Dog extends Animal {
    public Dog() {
        super("拉斯");
    }
    public static void main(String[] args){
        new Dog();
    }
}