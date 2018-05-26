package net.smallyu.java.designpattern.templatemethod.cases3;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run() {
        this.start();
        this.engineBoom();
        if(this.isAlarm()) {
            this.alarm();
        }
        this.alarm();

        this.stop();
    }
    // 钩子方法
    protected boolean isAlarm() {
        return true;
    }

    public abstract void setAlarm(boolean b);
}
