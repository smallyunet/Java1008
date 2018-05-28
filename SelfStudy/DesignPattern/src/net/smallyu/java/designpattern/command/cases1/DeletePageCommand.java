package net.smallyu.java.designpattern.command.cases1;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        // 找到页面组
        super.pg.find();
        // 增加一份需求
        super.pg.delete();
        // 给出计划
        super.pg.plan();
    }
}
