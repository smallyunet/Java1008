package net.smallyu.java.oopprinciples.singleresponsibility;

public interface IPhone {
    // 拨通电话
    public void dial(String phoneNumber);
    // 通话
    public void chat(Object o);
    // 通话完毕，挂电话
    public void hangup();
}
