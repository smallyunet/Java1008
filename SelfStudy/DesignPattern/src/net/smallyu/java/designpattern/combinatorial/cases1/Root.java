package net.smallyu.java.designpattern.combinatorial.cases1;

import java.util.ArrayList;

public class Root implements IRoot {
    private ArrayList subordinatelist  = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称" + this.name;
        info = info + "\t职位" + this.position;
        info = info + "\t薪水" + this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinatelist.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinatelist.add(leaf);
    }

    @Override
    public ArrayList getSubordiateInfo() {
        return this.subordinatelist;
    }
}
