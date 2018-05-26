package net.smallyu.java.designpattern.abstracfactory.cases2;

public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductA createProductB() {
        return new ProductA1();
    }
}
