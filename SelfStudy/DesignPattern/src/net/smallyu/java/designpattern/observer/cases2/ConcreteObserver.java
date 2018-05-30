package net.smallyu.java.designpattern.observer.cases2;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接到信息，进行处理");
    }
}
