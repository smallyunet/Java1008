package net.smallyu.java.designpattern.memento.cases1;

public class Boy {
    // 男孩的状态
    private String state = "";
    public void changState() {
        this.state = "心情可能很不好";
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento() {
        return new Memento(this.state);
    }
    public void restoreMemento(Memento _memento){
        this.setState(_memento.getState());
    }
}
