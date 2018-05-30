package net.smallyu.java.designpattern.combinatorial.cases3;

public class Client {
    public static void display(Component root) {
        for(Component c: root.getChildren()){
            if(c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
