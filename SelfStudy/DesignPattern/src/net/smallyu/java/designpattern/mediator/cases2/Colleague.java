package net.smallyu.java.designpattern.mediator.cases2;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediaor) {
        this.mediator = _mediaor;
    }
}
