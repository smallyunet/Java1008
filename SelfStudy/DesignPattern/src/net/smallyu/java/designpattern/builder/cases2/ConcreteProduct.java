package net.smallyu.java.designpattern.builder.cases2;

public class ConcreteProduct extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {
        // TODO: 2018/5/27 0027
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
