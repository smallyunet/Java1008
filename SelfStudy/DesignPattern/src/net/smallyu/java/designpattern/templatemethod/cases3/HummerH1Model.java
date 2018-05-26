package net.smallyu.java.designpattern.templatemethod.cases3;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马1引擎声");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    // 客户决定响不响喇叭
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
