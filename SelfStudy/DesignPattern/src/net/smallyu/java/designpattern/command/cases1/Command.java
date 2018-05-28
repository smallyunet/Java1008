package net.smallyu.java.designpattern.command.cases1;

public abstract class Command {
    // 定义三个组
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    // 只有一个方法，你要我做什么事情
    public abstract void execute();
}
