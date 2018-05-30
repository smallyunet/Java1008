package net.smallyu.java.designpattern.combinatorial.cases1;

import java.util.ArrayList;

public interface IBranch extends ICorp {
    public void addSubordinate(ICorp corp);
    public ArrayList<ICorp> getSubordinate();
//    public String getInfo();
//    public void add(IBranch branch);
//    public void add(ILeaf leaf);
//    public ArrayList getSubordinateInfo();
}
