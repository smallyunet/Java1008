package net.smallyu.java.designpattern.adapter.cases2;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
