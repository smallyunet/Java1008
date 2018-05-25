package net.smallyu.java.oopprinciples.openandclose;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
    // static静态模块初始化数据，实际醒目中一般由持久层完成
    static {
        bookList.add(new OffNovelBook("天龙八部", 3200,"金庸"));
        bookList.add(new OffNovelBook("巴黎圣母院", 5600,"雨果"));
        bookList.add(new OffNovelBook("天龙八部", 3200,"金庸"));
        bookList.add(new OffNovelBook("天龙八部", 3200,"金庸"));
        // 增加计算机书籍
        bookList.add(new ComputerBook("think in java", "编程语言","t", 3000));
    }
    // 模拟书店买书
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("----------书店卖出去的书籍记录如下：-----------");
        for (IBook book :
                bookList) {
            System.out.println("书籍名称：" + book.getName()
                + "\t书籍作者：" + book.getAuthor()
                + "\t书籍价格：" + formatter.format(book.getPrice()/100.0) + "元");
        }
    }
}












