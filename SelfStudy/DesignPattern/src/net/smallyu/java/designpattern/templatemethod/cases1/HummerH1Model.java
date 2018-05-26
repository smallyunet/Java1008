package net.smallyu.java.designpattern.templatemethod.cases1;

public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马1引擎声");
    }
}
