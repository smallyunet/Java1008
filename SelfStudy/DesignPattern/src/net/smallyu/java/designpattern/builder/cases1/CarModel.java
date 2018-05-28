package net.smallyu.java.designpattern.builder.cases1;

import java.util.ArrayList;

public abstract class CarModel {
    // 这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    // 模型启动
    protected abstract void start();

    // 停止
    protected abstract void stop();

    // 滴滴叫
    protected abstract void alarm();

    // 引擎会响
    protected abstract void engineBoom();

    // 模型会跑
    final public void run() {
        // 循环一遍，谁在前，谁先执行
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); // 开启汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
