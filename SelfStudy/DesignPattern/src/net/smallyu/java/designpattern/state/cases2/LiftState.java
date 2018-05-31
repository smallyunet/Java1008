package net.smallyu.java.designpattern.state.cases2;

public abstract class LiftState {
    // 定义环境角色
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
