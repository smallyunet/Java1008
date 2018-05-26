package net.smallyu.java.designpattern.templatemethod.cases2;

public abstract class AbstractClass {
    // 基本方法
    protected abstract void doSomething();
    protected abstract void doAnything();
    // 模板方法
    public void templateMethod() {
        // 调用基本方法，完成相关的逻辑
        this.doAnything();
        this.doSomething();
    }
}
