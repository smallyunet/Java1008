package net.smallyu.java.designpattern.factory.simple;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话，一般是单字节");
    }
}
