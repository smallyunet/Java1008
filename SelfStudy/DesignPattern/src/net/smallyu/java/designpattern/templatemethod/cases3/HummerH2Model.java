package net.smallyu.java.designpattern.templatemethod.cases3;

public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马2引擎声");
    }

    // 默认没有喇叭
    protected boolean isAlarm() {
        return false;
    }

    @Override
    public void setAlarm(boolean b) {

    }
}
