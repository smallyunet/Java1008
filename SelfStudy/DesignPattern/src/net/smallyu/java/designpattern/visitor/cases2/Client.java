package net.smallyu.java.designpattern.visitor.cases2;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element el = ObjectStruture.createElement();
            el.accept(new Visitor());
        }
    }
}
