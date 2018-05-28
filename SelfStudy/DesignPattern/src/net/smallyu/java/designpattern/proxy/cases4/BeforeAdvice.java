package net.smallyu.java.designpattern.proxy.cases4;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知");
    }
}
