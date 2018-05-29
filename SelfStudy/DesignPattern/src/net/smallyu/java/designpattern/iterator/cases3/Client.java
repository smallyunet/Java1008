package net.smallyu.java.designpattern.iterator.cases3;

public class Client {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("abc");
        agg.add("abc");
        // 遍历
        Iterator iterator = agg.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
