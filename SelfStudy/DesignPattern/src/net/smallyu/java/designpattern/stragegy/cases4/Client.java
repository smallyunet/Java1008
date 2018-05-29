package net.smallyu.java.designpattern.stragegy.cases4;

public class Client {
    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        String symbol =  args[1];
        Context context = null;
        if(symbol == "+"){
            context = new Context(new Add());
        } else {
            context = new Context(new Sub());
        }
//        context.exec(a , b, symbol);
    }
}
