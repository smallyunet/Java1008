package net.smallyu.java.oopprinciples.interfaceisolation.cases1;

public class Client {
    // 搜索并展示美女信息
    public static void main(String[] args) {
        // 定义一个美女
        IPettyGirl yanYan = new PettyGirl("燕燕");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
