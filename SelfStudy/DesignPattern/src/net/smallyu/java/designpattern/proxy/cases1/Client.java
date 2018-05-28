package net.smallyu.java.designpattern.proxy.cases1;

public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("小飞");
        // 使用代练
        IGamePlayer proxy = new GamePlayerProxy("小飞");
        // 开始打游戏，几记下时间戳
        System.out.println("开始时间是：2018-08-08");
        proxy.login("xiaofei", "password");
        // 开始打怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录游戏结束时间
        System.out.println("结束时间是： 2018-08-09");
    }
}
