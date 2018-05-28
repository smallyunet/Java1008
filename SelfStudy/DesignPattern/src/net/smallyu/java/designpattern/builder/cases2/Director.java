package net.smallyu.java.designpattern.builder.cases2;

public class Director {
    private Builder builder = new ConcreteProduct();
    // 构建不同的产品
    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
