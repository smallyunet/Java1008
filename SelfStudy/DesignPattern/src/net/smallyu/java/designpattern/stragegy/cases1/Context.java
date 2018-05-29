package net.smallyu.java.designpattern.stragegy.cases1;

public class Context {
    // 构造函数，你要使用哪个妙计
    private IStrategy strategy;
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    // 使用计谋了，看我出招
    public void operate() {
        this.strategy.operate();
    }
}
