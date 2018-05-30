package net.smallyu.java.designpattern.observer.cases1;

public class HanFeiZi implements IHanFeiZi {
    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;
    @Override
    public void havaeBreakfast() {
        System.out.println("韩非子开始吃饭了");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
