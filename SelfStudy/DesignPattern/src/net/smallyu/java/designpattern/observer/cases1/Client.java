package net.smallyu.java.designpattern.observer.cases1;

public class Client {
    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        Spy watchBrakfast = new Spy(hanFeiZi, liSi, "breakfase");
        watchBrakfast.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hanFeiZi.havaeBreakfast();
    }
}
