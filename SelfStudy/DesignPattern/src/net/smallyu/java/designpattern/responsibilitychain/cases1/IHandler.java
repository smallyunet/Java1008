package net.smallyu.java.designpattern.responsibilitychain.cases1;

public interface IHandler {
    // 一个女性要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
