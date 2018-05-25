package net.smallyu.java.oopprinciples.openandclose;

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String _name, int _price, String _author) {
        super(_name, _price, _author);
    }
    // 复写销售价格
    @Override
    public int getPrice() {
        // 原价
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if(selfPrice > 4000) {
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
