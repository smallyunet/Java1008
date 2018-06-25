package net.smallyu.java.patternpk.proxyvsdecorator.proxy;

public class Client {
    public static void main(String[] args) {
        // 定义一个运动员
        IRunner liu = new Runner();
        // 定义代理人
        IRunner agent = new RunnerAgent(liu);
        // 要求运动员跑步
        System.out.println("===客人找到运动员的代理要求去跑步");
        agent.run();
    }
}
