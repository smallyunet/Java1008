package net.smallyu.java.patternpk.abstractfactoryvsbuilder.builder;

public class BenzBuilder extends CarBuilder {
    @Override
    protected String buildWheel() {
        return super.getBlueprint().getEngine();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getWheel();
    }

}
