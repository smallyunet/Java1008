package net.smallyu.java.designpattern.memento.cases1;

public class Caretaker {
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void serMemento(Memento memento) {
        this.memento = memento;
    }
}
