package net.smallyu.java.patternpk.abstractfactoryvsbuilder.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("===制造一辆奔驰SUV===");
        ICar benzSUV = director.createBenzSuv();
        System.out.println(benzSUV);
        System.out.println("===制造一辆宝马商务车===");
        ICar bmwVan = director.createBenzSuv();
        System.out.println(bmwVan);
        System.out.println("===制造一辆混合车===");
        ICar complexCar = director.createBenzSuv();
        System.out.println(complexCar);
    }
}
