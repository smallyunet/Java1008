package net.smallyu.java.designpattern.responsibilitychain.cases1;

public abstract class Handler {
    public final static int FATHER_LEVER_REQUEST = 1;
    public final static int HUSBAND_LEVER_REQUEST = 2;
    public final static int SON_LEVERLREQUEST = 3;
    // 能处理的级别
    private int level = 0;
    // 责任传递
    private Handler nextHandler;
    // 每个类都要处理
    public Handler(int _level) {
        this.level = _level;
    }
    // 要求逛街，处理请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("------没地方请示了，不同意");
            }
        }
    }
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }
    // 有请示当然要回一个
    protected abstract void response(IWomen women);
}
