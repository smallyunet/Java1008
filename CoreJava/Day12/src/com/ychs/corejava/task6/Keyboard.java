package com.ychs.corejava.task6;

public class Keyboard implements IUSB {
    @Override
    public void start() {
        System.out.println("键盘开始使用");
    }

    @Override
    public void stop() {
        System.out.println("键盘停止使用");
    }
}
