package net.smallyu.java.designpattern.combinatorial.cases2;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    // 新增
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    // 删除
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
