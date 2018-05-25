package net.smallyu.java.oopprinciples.interfaceisolation.cases1;

public class PettyGirl implements IPettyGirl {
    private String name;
    // 美女都有名字
    public PettyGirl(String _name) {
        this.name = _name;
    }
    // 好看
    @Override
    public void goodLooking() {
        System.out.println(this.name + "-----好看");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "-----身材好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "-----气质好");
    }
}
