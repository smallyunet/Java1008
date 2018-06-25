package net.smallyu.java.patternpk.proxyvsdecorator.decorator;

import net.smallyu.java.patternpk.proxyvsdecorator.proxy.IRunner;
import net.smallyu.java.patternpk.proxyvsdecorator.proxy.Runner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;
    public RunnerWithJet(IRunner runner) {
        this.runner =  runner;
    }
    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
