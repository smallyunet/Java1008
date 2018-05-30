package net.smallyu.java.designpattern.observer.cases1;

public class LiSi implements ILiSi {
    @Override
    public void update(String str) {
        System.out.println("李斯观察韩非子的活动，开始向老板汇报了");
        this.reportToQiShiHuang(str);
        System.out.println("李斯汇报完毕");
    }
    private void reportToQiShiHuang(String reportContext) {
        System.out.println("报告老板，韩非子有活动了" + reportContext);
    }
}
