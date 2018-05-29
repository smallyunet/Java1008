package net.smallyu.java.designpattern.adapter.cases2;

public class Client {
    public static void main(String[] args) {
        // 原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 增加了适配器后
        Target target2 = new Adapter();
        target2.request();
    }
}
