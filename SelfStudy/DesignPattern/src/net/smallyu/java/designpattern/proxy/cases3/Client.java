package net.smallyu.java.designpattern.proxy.cases3;

import net.smallyu.java.designpattern.proxy.cases1.GamePlayer;
import net.smallyu.java.designpattern.proxy.cases1.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        // 开始游戏
        System.out.println("开始时间是： 888");
        // 获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
        // 登录
        proxy.login("zhangsan", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录游戏结束时间
        System.out.println("结束时间是： 999");
    }
}
