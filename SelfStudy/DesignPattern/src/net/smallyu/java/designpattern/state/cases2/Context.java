package net.smallyu.java.designpattern.state.cases2;

public class Context {
    public final static OpenningState openningState = new OpenningState();
    public final static OpenningState closeingState = new OpenningState();
    private LiftState liftState;
    public LiftState getLiftState() {
        return liftState;
    }
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }
}
