package net.smallyu.java.patternpk.abstractfactoryvsbuilder.abstractfactory;

public class BMWFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan() {
        return new BMWBan();
    }
}
