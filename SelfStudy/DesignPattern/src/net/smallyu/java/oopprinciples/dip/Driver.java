package net.smallyu.java.oopprinciples.dip;

public class Driver implements IDriver {
    private ICar car;
    // setter注入
    public void setCar(ICar car) {
        this.car = car;
    }

    @Override
    public void drive(ICar car) {

    }

    // 构造函数注入
//    public Driver(ICar _car) {
//        this.car = _car;
//    }

    // 司机的主要职责就是驾驶汽车
    public void drive() {
        this.car.run();
    }

//    public void drive(Benz benz) {
//        benz.run();
//    }
}
