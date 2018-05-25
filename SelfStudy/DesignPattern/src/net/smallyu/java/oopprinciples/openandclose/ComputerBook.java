
package net.smallyu.java.oopprinciples.openandclose;

public class ComputerBook implements IComputerBook {
    private String name;
    private String scope;
    private String author;
    private int price;

    public ComputerBook(String name, String scope, String author, int price) {
        this.name = name;
        this.scope = scope;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
