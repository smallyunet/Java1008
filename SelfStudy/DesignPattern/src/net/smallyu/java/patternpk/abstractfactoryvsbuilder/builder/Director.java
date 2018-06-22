package net.smallyu.java.patternpk.abstractfactoryvsbuilder.builder;

public class Director {
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();
    public ICar createBenzSuv() {
        return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
    }
    public ICar createBMWVan() {
        return createCar(benzBuilder, "BMW的引擎", "BMW的引擎");
    }
    public ICar createComplexCar() {
        return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
    }
    private ICar createCar(CarBuilder _carBuilder, String engine, String wheel){
        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);
        System.out.println("获得生产蓝图");
        _carBuilder.receiveBlueprint(bp);
        return _carBuilder.buildCar();
    }
}
