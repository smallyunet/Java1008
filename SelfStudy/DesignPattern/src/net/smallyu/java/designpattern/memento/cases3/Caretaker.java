package net.smallyu.java.designpattern.memento.cases3;

public class Caretaker {
    private Originator originator;
    public Originator getMemento() {
        return originator;
    }
    public void setMemento(Originator originator){
        this.originator = originator;
    }
}
