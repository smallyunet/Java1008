package net.smallyu.java.designpattern.memento.cases1;

public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很棒！");
        System.out.println("=======男孩现在的状态=======");
        System.out.println(boy.getState());
        // 需要记录下当前状态
//        Boy backup = new Boy();
//        backup.setState(boy.getState());
//        Memento mem = boy.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.serMemento(boy.createMemento());
        // 男孩去追男孩
        boy.changState();
        System.out.println("\n=======男孩追女孩子后的状态");
        System.out.println(boy.getState());
        // 追女孩失败，恢复原状
//        boy.setState(backup.getState());
//        boy.restoreMemento(mem);
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("\n=======男孩恢复后的状态");
        System.out.println(boy.getState());
    }
}
