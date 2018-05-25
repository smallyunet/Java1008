package net.smallyu.java.oopprinciples.richterreplacement.cases1;

public class Client {
    public static void main(String[] args) {
        // 产生士兵
//        Solider sanMao = new Solider();
//        sanMao.setGun(new Rifle());
//        sanMao.setGun(new ToyGun());
//        sanMao.killEnemy();
        Snipper sanMao = new Snipper();
        sanMao.killEnemy(new AUG());
    }
}
