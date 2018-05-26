package net.smallyu.java.designpattern.abstracfactory.cases1;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话一般都是单字节的");
    }
}
