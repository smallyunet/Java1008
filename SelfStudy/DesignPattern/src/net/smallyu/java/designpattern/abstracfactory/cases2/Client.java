package net.smallyu.java.designpattern.abstracfactory.cases2;

public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
//        AbstractCreator creator2 = new Creator2();
        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
//        AbstractProductA a2 = creator1.createProductA();

        // TODO: 2018/5/26 0026
    }
}
