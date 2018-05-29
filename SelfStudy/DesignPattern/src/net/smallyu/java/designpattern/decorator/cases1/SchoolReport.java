package net.smallyu.java.designpattern.decorator.cases1;

public abstract class SchoolReport {
    // 成绩单主要展示成绩情况
    public abstract void report();
    // 成绩单要家长签字
    public abstract void sign(String name);
}
