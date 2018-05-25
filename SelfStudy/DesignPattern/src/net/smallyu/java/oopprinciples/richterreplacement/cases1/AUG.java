package net.smallyu.java.oopprinciples.richterreplacement.cases1;

/**
 * AUG狙击枪
 */
public class AUG extends Rifle {
    // 狙击枪都带着望远镜
    public void zoomOut() {
        System.out.println("通过望远镜查看敌人。。。");
    }
    public void shoot() {
        System.out.println("AUG射击。。。");
    }
}
