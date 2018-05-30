package net.smallyu.java.designpattern.observer.cases2;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject =  new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addOberver(obs);
        subject.doSomething();
    }
}
