package net.smallyu.java.designpattern.proxy.cases4;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        // 定义一个handle
//        InvocationHandler handler = new MyInvocationHandler(subject);
        // 定义主题的代理
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        // 代理的行为
        proxy.doSomething("Finish");;
    }
}
