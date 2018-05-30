package net.smallyu.java.designpattern.combinatorial.cases3;

import java.util.ArrayList;

public abstract class Component {
    // 个体和整体都具有的共享
    public void doSomething() {

    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract ArrayList<Component> getChildren();
}
