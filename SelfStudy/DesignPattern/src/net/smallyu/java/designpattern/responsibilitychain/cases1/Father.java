package net.smallyu.java.designpattern.responsibilitychain.cases1;

public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-----------女儿向父亲请示");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复： 同意\n");
    }
}
