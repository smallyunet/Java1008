package net.smallyu.java.oopprinciples.richterreplacement.cases2;

import java.util.HashMap;

public class Client {
    public static void invoker() {
        // 父类存在的地方，子类就应该能存在
//        Father f = new Father();
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }
    public static void main(String[] args) {
        invoker();
    }
}
