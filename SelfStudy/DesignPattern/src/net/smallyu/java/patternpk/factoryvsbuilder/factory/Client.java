package net.smallyu.java.patternpk.factoryvsbuilder.factory;

public class Client {
    public static void main(String[] args) {
        // 生产一个成年超人
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        // 展示一下超人的技能
        adultSuperMan.specialTalent();
    }
}
