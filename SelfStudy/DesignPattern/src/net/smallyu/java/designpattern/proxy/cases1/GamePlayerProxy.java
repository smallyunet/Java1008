package net.smallyu.java.designpattern.proxy.cases1;

public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;
    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 通过构造函数传递参数
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void coun() {
        System.out.println("升级总费用是：150元");
    }
}
