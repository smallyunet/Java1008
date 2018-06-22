package net.smallyu.java.patternpk.abstractfactoryvsbuilder.abstractfactory;

public abstract class AbsBMW implements ICar {
    private final static String BMW_BAND = "宝马汽车";
    @Override
    public String getBand() {
        return BMW_BAND;
    }

    @Override
    public abstract String getModel();
}
