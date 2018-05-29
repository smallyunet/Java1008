package net.smallyu.java.designpattern.stragegy.cases1;

public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙");
    }
}
