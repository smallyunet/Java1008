package net.smallyu.java.designpattern.combinatorial.cases1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        // 首先产生一个根节点
        IRoot ceo = new Root("王二狗", "总经理", 100000);
        // 三个部门经理，树枝节点
        IBranch developDep = new Branch("小王","研发部门经理",100000);
        IBranch salesDep = new Branch("小李","销售部门经理",200000);
        IBranch financeDep = new Branch("小飞","财务部门经理",300000);
        // 三个小组长
        IBranch firstDepGroup = new Branch("杨三","开发一组组长",5000);
        IBranch secondDepGroup = new Branch("英大","开发二组组长",6000);
        // 小兵
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("a", "开发人员", 2000);
        ILeaf c = new Leaf("a", "开发人员", 2000);
        ILeaf d = new Leaf("a", "开发人员", 2000);
        ILeaf e = new Leaf("a", "开发人员", 2000);
        ILeaf f = new Leaf("a", "开发人员", 2000);
        ILeaf g = new Leaf("a", "开发人员", 2000);
        ILeaf h = new Leaf("a", "开发人员", 2000);
        ILeaf i = new Leaf("a", "开发人员", 2000);
        ILeaf j = new Leaf("a", "开发人员", 2000);
        ILeaf zhengLaoLiu = new Leaf("郑留", "研发部副总", 200000);
        // 定义总经理下三个部门经理
        ceo.add(developDep);
        ceo.add(developDep);
        ceo.add(developDep);
        // 总经理有一个秘书
        ceo.add(j);
        // 研发部门结构
//        developDep.add(firstDepGroup);
//        developDep.add(secondDepGroup);
        // 研发部副总
//        developDep.add(zhengLaoLiu);
        // 开发小组下
//        firstDepGroup.add(a);
//        firstDepGroup.add(b);
//        firstDepGroup.add(c);
//        secondDepGroup.add(d);
//        secondDepGroup.add(e);
//        secondDepGroup.add(f);
        // 销售部下的人员情况
//        salesDep.add(h);
//        salesDep.add(i);
        // 最后一个财务
//        financeDep.add(j);
        // 打印写完的树状结构
        System.out.println(ceo.getInfo());
        // 打印出来整个树
        getAllSubordinateInfo(ceo.getSubordiateInfo());
    }

    // 遍历所有树枝节点
    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        int length = subordinateList.size();
        for(int m = 0; m < length; m++) {
            Object s = subordinateList.get(m);
            if(s instanceof Leaf){
                ILeaf employee = (ILeaf)s;
                System.out.println(((Leaf) s).getInfo());
            } else {
                IBranch branch = (IBranch)s;
                System.out.println(branch.getInfo());
                // 递归调用
//                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
