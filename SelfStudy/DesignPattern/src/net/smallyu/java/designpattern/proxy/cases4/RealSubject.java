package net.smallyu.java.designpattern.proxy.cases4;

/**
 * 真实主题类
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!-->" + str);
    }
}
