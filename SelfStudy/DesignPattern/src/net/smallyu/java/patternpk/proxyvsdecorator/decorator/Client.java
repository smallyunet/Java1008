package net.smallyu.java.patternpk.proxyvsdecorator.decorator;

import net.smallyu.java.patternpk.proxyvsdecorator.proxy.IRunner;
import net.smallyu.java.patternpk.proxyvsdecorator.proxy.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        liu = new RunnerWithJet(liu);
        System.out.println("===增强后的运动员的功能===");
        liu.run();
    }
}
