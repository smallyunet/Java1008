package net.smallyu.java.designpattern.responsibilitychain.cases1;

public class Son implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
