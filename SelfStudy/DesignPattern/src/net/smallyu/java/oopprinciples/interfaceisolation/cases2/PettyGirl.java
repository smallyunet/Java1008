package net.smallyu.java.oopprinciples.interfaceisolation.cases2;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;
    public PettyGirl(String _name) {
        this.name = _name;
    }

    @Override
    public void goodLooking() {
        System.out.println("好看");
    }

    @Override
    public void niceFigure() {
        System.out.println("身材好");
    }

    @Override
    public void greatTemperament() {
        System.out.println("气质好");
    }
}
