package net.smallyu.java.designpattern.facade.cases2;

public class Facade2 {
    private Facade facade = new Facade();
    public void methodB() {
        this.facade.methodB();
    }
}
