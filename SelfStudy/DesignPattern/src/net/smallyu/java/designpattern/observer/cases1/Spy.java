package net.smallyu.java.designpattern.observer.cases1;

public class Spy extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;
    public Spy(HanFeiZi _hanFeiZi, LiSi _liSi, String _type) {
        this.hanFeiZi = _hanFeiZi;
        this.liSi = _liSi;
        this.type = _type;
    }
    public void run() {
        while(true) {
            if(this.type.equals("breakfast")) {
                if(this.hanFeiZi.isHavingBreakfast()) {
                    this.liSi.update("韩非子在吃饭");
                }
            } else {
                if(this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
