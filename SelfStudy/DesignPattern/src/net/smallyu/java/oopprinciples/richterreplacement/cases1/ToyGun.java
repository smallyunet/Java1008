package net.smallyu.java.oopprinciples.richterreplacement.cases1;

public class ToyGun extends AbstractGun {
    @Override
    public void shoot() {
        // 玩具枪不能射击，这个方法不实现
    }
}
