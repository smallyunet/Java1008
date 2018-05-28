package net.smallyu.java.designpattern.command.cases1;

public class Client {
    public static void main(String[] args) {
//        System.out.println("---------客户要求新增一项需求---------");
//        Group rg = new RequirementGroup();
//        rg.find();
//        rg.add();
//        rg.plan();
        // 接头人
        Invoker xiaoSan = new Invoker();
        System.out.println("---------客户要求新增一项需求---------");
        Command command = new AddRequirementCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
