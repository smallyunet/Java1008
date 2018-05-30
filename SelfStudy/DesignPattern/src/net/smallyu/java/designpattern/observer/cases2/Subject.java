package net.smallyu.java.designpattern.observer.cases2;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<Observer>();
    public void addOberver(Observer o) {
        this.obsVector.add(o);
    }
    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }
    public void notifyObservers() {
        for(Observer o:this.obsVector) {
            o.update();
        }
    }
}

