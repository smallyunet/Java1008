package net.smallyu.java.designpattern.singleton.cases;

import net.smallyu.java.designpattern.singleton.cases.Emperor;

public class Minister {
    public static void main(String[] args) {
        // 定义5个大臣
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}

/*
public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
        // 三次都是同一个对象
    }
}
*/
