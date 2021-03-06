package net.smallyu.java.designpattern.visitor.cases2;

import java.util.Random;

public class ObjectStruture {
    public static Element createElement() {
        Random rand = new Random();
        if(rand.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
