package net.smallyu.java.designpattern.factory.cases;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话，一般说的是双字节");
    }
}
