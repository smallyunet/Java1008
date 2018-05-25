package net.smallyu.java.oopprinciples.richterreplacement.cases1;

public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射。。。");
    }
}
