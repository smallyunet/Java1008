package net.smallyu.java.oopprinciples.richterreplacement.cases2;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
    // 放大输入类型参数
    public Collection doSomething(Map map) {
        System.out.println("子类被执行。。。");
        return map.values();
    }
}
