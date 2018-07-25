package java.concurrency.two;

/*
如果锁不可重入，这段代码将死锁
*/

public class Widget {
    public synchronized void doSomething() {
        // TODO
    }
}

class LoggingWidge extends Widget {
    public synchronized void doSomething() {
        System.out.println(toString() + ": calling doSomething");
        super.doSomething();
    }
}
