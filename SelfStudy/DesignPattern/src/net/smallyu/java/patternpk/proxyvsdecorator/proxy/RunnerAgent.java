package net.smallyu.java.patternpk.proxyvsdecorator.proxy;

import java.util.Random;

public class RunnerAgent implements IRunner {
    private IRunner runner;
    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }
    @Override
    public void run() {
        Random rand = new Random();
        if(rand.nextBoolean()) {
            System.out.println("代理人同意安排运动员跑步");
        } else {
            System.out.println("代理人心情不好，不安排运动员跑步");
        }
    }
}
