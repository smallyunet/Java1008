package net.smallyu.java.designpattern.stragegy.cases1;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
