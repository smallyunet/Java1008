package net.smallyu.java.designpattern.bridge;

public class ClothCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生产");
    }

    @Override
    protected void sell() {
        System.out.println("出售");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚小钱");
    }
}
