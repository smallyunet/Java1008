package net.smallyu.java.designpattern.memento.cases2;

public class Caretaker {
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
