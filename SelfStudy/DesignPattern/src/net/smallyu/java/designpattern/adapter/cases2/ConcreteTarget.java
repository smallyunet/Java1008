package net.smallyu.java.designpattern.adapter.cases2;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help, pls call me");
    }
}
