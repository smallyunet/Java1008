package net.smallyu.java.designpattern.stragegy.cases1;

public class ZhaoYun {
    public static void main(String[] args) {
        // 赵云出厂了，他根据诸葛亮给他的交代，依次拆开妙计
        Context context;
        // 刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个");
        context = new Context(new BackDoor());
        context.operate();
        // 第二个
        System.out.println("-----------");
        context = new Context(new GivenGreenLight());
        context.operate();
        // 孙权的小兵追了
        System.out.println("-----------");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
