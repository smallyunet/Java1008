package net.smallyu.java.designpattern.state.cases1;

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPONG_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
