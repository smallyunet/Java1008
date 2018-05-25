package net.smallyu.java.oopprinciples.interfaceisolation.cases1;

public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl _pettyGirl) {
        this.pettyGirl = _pettyGirl;
    }
    // 搜索美女
    public abstract void show();
}
