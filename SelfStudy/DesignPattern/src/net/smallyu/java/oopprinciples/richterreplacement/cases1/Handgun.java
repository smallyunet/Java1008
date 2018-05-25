package net.smallyu.java.oopprinciples.richterreplacement.cases1;

public class Handgun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("手枪射击。。。");
    }
}
