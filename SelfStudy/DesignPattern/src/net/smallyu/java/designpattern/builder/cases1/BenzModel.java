package net.smallyu.java.designpattern.builder.cases1;

public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车喇叭响了");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎声音");
    }
}
