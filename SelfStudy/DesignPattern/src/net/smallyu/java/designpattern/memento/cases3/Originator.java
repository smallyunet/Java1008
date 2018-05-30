package net.smallyu.java.designpattern.memento.cases3;

public class Originator implements Cloneable {
    private Originator backup;
    private String state = "";

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

    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    protected Originator clone() {
        try{
            return (Originator)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

