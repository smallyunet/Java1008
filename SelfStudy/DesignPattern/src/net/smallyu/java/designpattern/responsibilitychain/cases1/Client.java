package net.smallyu.java.designpattern.responsibilitychain.cases1;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // 随机挑选女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        // 定义三个请示对象
        IHandler father = new Father();
        IHandler hushand = new Husband();
        IHandler son = new Son();
        for(IWomen women : arrayList) {
            if(women.getType() ==1) {
                System.out.println("\n----女儿向父亲请示");
                father.HandleMessage(women);
            } else if (women.getType() ==2) {
                System.out.println("\n----妻子向丈夫请示");
                hushand.HandleMessage(women);
            } else if (women.getType() ==3) {
                System.out.println("\n----母亲向儿子请示");
                son.HandleMessage(women);
            } else {

            }
        }
    }
}
