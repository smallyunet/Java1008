package net.smallyu.java.oopprinciples.dip;

public class Client {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
//        Benz benz = new Benz();
        ICar bmw = new BMW();
        // 张三开奔驰车
//        zhangSan.drive(benz);
        zhangSan.drive(bmw);
    }
}
