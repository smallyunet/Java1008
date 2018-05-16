/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson11;

/**
 * 重写
 * 
 * @author smallyu
 * @version 1.0
 */
public class car {
    String cname = "dazhong";

    private void drive(int a, String b) {
        System.out.println("有人驾驶的汽车");
    }
}

class BaiduCar extends Car {
    String cname = "BaiduCar";

    public void drive(int c, String b) {
        System.out.println(new Car().cname);
        System.out.println(super.cname);
        super.driver(1, 'd');
        System.out.println("有人驾驶 + 无人驾驶");
    }

    public static void main(String[] args) {
        // super.drive(1,dd);
    }
}