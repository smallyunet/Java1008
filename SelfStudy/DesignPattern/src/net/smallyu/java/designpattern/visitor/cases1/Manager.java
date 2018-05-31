package net.smallyu.java.designpattern.visitor.cases1;

public class Manager extends Employee {
    private String performance;
    protected String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }
    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}

