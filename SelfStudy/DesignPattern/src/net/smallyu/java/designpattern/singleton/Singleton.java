package net.smallyu.java.designpattern.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();
    // 限制实例化
    private Singleton() {}
    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }
    // 类中其他方法，尽量是static
    public static void dosomething(){

    }
}

// 线程不安全的单例
/*
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {

    }
    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
*/
