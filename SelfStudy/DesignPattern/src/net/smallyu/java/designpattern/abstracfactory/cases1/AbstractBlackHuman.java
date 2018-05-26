package net.smallyu.java.designpattern.abstracfactory.cases1;

public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的");
    }
    public void talk() {
        System.out.println("黑人说话，一般人听不懂");
    }
}
