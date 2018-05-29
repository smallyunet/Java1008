package net.smallyu.java.designpattern.stragegy.cases4;

public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
