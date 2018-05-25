package net.smallyu.java.designpattern.factory;

public abstract class Creator {
    /**
     * 创建一个产品对象，输入参数类型可自行设置
     * 通常为String、Enum、Class等
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
