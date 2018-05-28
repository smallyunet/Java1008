package net.smallyu.java.designpattern.command.cases2;

public class Invoker {
    private Command command;
    // 接收命令
    public void setCommand(Command _command) {
        this.command = _command;
    }
    // 执行命令
    public void action() {
        this.command.execute();
    }
}
