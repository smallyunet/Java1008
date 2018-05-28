package net.smallyu.java.designpattern.proxy.cases4;

import java.lang.reflect.InvocationHandler;

/**
 * 代理类
 */
public class Proxy implements Subject {
    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object... objects) {

    }

    // 预处理
    private void before() {
    }

    // 善后处理
    private void after() {
    }

    @Override
    public void doSomething(String str) {

    }
}
