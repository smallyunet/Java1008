package net.smallyu.java.patternpk.factoryvsbuilder.factory;

/**
 * 工厂类
 */
public class SuperManFactory {
    public static ISuperMan createSuperMan(String type) {
        // 根据输入参数产生不同的超人
        if(type.equalsIgnoreCase("adult")) {
            // 生产成人超人
            return new AdultSuperMan();
        } else if(type.equalsIgnoreCase("adult")) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
