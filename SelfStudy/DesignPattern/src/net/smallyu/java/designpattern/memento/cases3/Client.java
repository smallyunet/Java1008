package net.smallyu.java.designpattern.memento.cases3;

public class Client {
    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();
        originator.setState("初始状态……");
        System.out.println("初始状态是：" + originator.getState());
        originator.createMemento();
        originator.setState("修改后的状态");
        System.out.println(originator.getState());
        originator.restoreMemento();
        System.out.println(originator.getState());
        // 定义备忘录管理员
//        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
//        caretaker.setMemento(originator.createMemento());
        // 恢复一个备忘录
//        originator.restoreMemento(caretaker.getMemento());
    }
}
