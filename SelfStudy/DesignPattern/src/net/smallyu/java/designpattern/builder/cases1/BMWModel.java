package net.smallyu.java.designpattern.builder.cases1;

public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车喇叭响了");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎声音");
    }
}
