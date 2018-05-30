package net.smallyu.java.designpattern.observer.cases2;

public class ConcreteSubject extends Subject{
    public void doSomething() {
        super.notifyObservers();
    }
}
