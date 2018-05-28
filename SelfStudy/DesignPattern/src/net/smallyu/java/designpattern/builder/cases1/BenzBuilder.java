package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> seqence) {
        this.benz.setSequence(seqence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
