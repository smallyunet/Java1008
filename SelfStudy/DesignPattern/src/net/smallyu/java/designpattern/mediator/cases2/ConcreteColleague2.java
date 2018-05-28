package net.smallyu.java.designpattern.mediator.cases2;

public class ConcreteColleague2 extends Colleague {
    // 通过构造函数传递中介者
    public ConcreteColleague2(Mediator _mediaor) {
        super(_mediaor);
    }
    // 自有方法 self-method
    public void selfMethod2() {

    }
    // 依赖方法 dep-method
    public void depMethod2() {
        // 自己不处理的逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
