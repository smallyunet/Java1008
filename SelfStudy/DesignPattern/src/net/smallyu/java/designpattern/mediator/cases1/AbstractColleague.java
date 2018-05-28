package net.smallyu.java.designpattern.mediator.cases1;

public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
