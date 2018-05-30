package net.smallyu.java.designpattern.memento.cases2;

public class Originator {
    private String state ="";
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}
