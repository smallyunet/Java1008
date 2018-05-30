package net.smallyu.java.designpattern.facade.cases2;

public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    private Context context = new Context();
    // 提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }
    public void methodB() {
        this.b.doSomethingB();
    }
    public void methodC() {
        this.a.doSomethingA();
        this.c.doSomethingC();
        this.context.complexMethod();
    }
}
