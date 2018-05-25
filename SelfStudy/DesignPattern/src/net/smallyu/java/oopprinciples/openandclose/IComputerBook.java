package net.smallyu.java.oopprinciples.openandclose;

public interface IComputerBook extends IBook {
    // 计算机书籍有一个范围
    public String getScope();
}
