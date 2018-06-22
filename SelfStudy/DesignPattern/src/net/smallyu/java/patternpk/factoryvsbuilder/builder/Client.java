package net.smallyu.java.patternpk.factoryvsbuilder.builder;

public class Client {
    public static void main(String[] args) {
        // 建造出一个成年超人
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        // 展示一个超人的信息
        adultSuperMan.getSpecialTalent();
    }
}
