package net.smallyu.java.designpattern.state.cases2;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
