package net.smallyu.java.oopprinciples.richterreplacement.cases1;

public class Snipper {
    public void killEnemy(AUG aug) {
        // 首先看看敌人的情况
        aug.zoomOut();
        // 开始射击
        aug.shoot();
    }
}
