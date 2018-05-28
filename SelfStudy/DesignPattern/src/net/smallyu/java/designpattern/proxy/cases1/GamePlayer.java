package net.smallyu.java.designpattern.proxy.cases1;

public class GamePlayer implements IGamePlayer {
    private String name = "";
    // 我的代理是谁
    private IGamePlayer proxy = null;

    // 构造函数传递名称
    public GamePlayer(String _name) {
        this.name = _name;
    }

    // 构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真是角色！");
        } else {
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        // 强制代理使用if语句实现
        if (this.isProxy()) {
            System.out.println("登录名为 " + user + " 的用户 " + this.name + " 登录成功");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级");
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this.name);
        return this.proxy;
    }

    // 校验是否是代理访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
