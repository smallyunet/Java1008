package net.smallyu.java.oopprinciples.dip;

public interface IDriver {
    // 车辆型号
    public void setCar(ICar car);

    // 是司机就应该会驾驶汽车
    public void drive(ICar car);
}
