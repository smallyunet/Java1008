package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public abstract class CarBuilder {
    // 建造一个模型，接收一个顺序
    public abstract void setSequence(ArrayList<String> seqence);
    // 设置完顺序
    public abstract CarModel getCarModel();
}
