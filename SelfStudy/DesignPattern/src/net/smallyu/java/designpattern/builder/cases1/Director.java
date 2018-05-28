package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    /*
     * A类型奔驰车
     */
    public BenzModel getABenzModel() {
        // 清理场景
        this.sequence.clear();
        // 执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    /**
     * B类型车
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }
    /**
     * C类型车
     */
    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCarModel();
    }
    /**
     * D类型车
     */
    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.benzBuilder.getCarModel();
    }
}
