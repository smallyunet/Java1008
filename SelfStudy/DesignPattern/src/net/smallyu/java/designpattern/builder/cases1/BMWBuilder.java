package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> seqence) {
        this.bmw.setSequence(seqence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
