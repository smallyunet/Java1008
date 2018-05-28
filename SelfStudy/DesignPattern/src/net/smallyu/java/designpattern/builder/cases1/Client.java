package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        // 存放run顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        // 要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        // 把顺序给builder类
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        benz.run();

        // 按照同样的顺序，要一个宝马车
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
        
        
        // 使用导演类
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        // TODO: 2018/5/27 0027
    }
}
