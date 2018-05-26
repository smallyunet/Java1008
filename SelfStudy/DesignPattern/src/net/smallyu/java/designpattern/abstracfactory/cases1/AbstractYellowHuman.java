package net.smallyu.java.designpattern.abstracfactory.cases1;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种一般说的都是双字节");
    }
}
