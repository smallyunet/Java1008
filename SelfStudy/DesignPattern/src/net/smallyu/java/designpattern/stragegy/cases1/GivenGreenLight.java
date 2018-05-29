package net.smallyu.java.designpattern.stragegy.cases1;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯");
    }
}
