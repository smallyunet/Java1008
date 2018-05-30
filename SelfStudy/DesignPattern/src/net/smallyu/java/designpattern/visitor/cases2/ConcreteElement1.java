package net.smallyu.java.designpattern.visitor.cases2;

public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
