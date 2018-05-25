package net.smallyu.java.designpattern.factory.cases;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
