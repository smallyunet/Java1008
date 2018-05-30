package net.smallyu.java.designpattern.facade.cases2;

public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();
    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
