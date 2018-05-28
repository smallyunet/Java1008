package net.smallyu.java.designpattern.command.cases2;

public class ConcreteCommand1 extends Command {
    // 对哪个receiver类进行命令处理
    private Receiver receiver;
    // 构造函数传递接收者
    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }
    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
