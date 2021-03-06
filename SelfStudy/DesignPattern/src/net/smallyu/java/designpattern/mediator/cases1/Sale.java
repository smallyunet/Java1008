package net.smallyu.java.designpattern.mediator.cases1;

import java.util.Random;

public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 销售IBM电脑
    public void sellIBMComputer(int number) {
        // 访问库存
//        Stock stock = new Stock();
//        // 访问采购
//        Purchase purchase = new Purchase();
//        if (stock.getSotckNumber() < number) {
//            purchase.buyIBMcomputer(number);
//        }
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
//        stock.decrease(number);
    }

    // 反馈销售情况
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况为：" + saleStatus);
        return saleStatus;
    }

    // 折价处理
    public void offSale() {
        super.mediator.execute("sale.offsell");
        // 库房有多少卖多少
//        Stock stock = new Stock();
//        System.out.println("折价销售IBM电脑" + stock.getSotckNumber() + "台");
    }
}
