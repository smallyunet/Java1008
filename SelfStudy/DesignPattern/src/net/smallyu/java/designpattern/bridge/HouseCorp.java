package net.smallyu.java.designpattern.bridge;

public class HouseCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("盖房子");
    }

    @Override
    protected void sell() {
        System.out.println("出售房子");
    }
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱了");
    }
}
