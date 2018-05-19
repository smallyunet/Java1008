package com.ychs.corejava.task6;

public class Mouse implements IUSB {
    @Override
    public void start() {
        System.out.println("鼠标开始使用");
    }

    @Override
    public void stop() {
        System.out.println("鼠标停止使用");
    }
}
