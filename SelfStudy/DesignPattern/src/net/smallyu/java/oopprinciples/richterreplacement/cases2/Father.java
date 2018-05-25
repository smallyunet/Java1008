package net.smallyu.java.oopprinciples.richterreplacement.cases2;

import java.util.Collection;
import java.util.HashMap;

public class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行");
        return map.values();
    }
}
