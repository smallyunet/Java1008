package net.smallyu.java.designpattern.combinatorial.cases1;

import java.util.ArrayList;

public interface IRoot {
    // 得到总经理信息
    public String getInfo();
    // 增加小兵
    public void add(IBranch branch);
    // 增加叶子节点
    public void add(ILeaf leaf);
    // 遍历
    public ArrayList getSubordiateInfo();
}
