/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * 手机类
 * 
 * @author smallyu
 * @version 1.0
 */
public class Mobile {
    public Mobile() {
        System.out.println("3333");
    }
    punlic int getPrice() {
        System.out.println("1111");
        return 2000;
    }
    {// 游离语句块
        System.out.println("22222");
    }
    int price = getPrice();
    public static void main(String[] args) {
        new Mobile();
    }
}

/**
 * 手机子类
 */
class HuaWei extends Mobile {
    public HuaWei() {
        System.out.println("444");
    }
    public int getPrice1() {
        System.out.println("555");
        return 2000;
    }
    {// 游离语句块
        System.out.println("666");
    }
    int price = getPrice1();
    public static void main(String[] args) {
        new HuaWei();
    }
}