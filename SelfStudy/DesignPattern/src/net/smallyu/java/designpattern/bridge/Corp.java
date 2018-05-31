package net.smallyu.java.designpattern.bridge;

public abstract class Corp {
    protected abstract void produce();
    protected abstract void sell();
    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
