package net.smallyu.java.designpattern.visitor.cases1;

public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
}
