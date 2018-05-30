package net.smallyu.java.designpattern.visitor.cases1;

public class CommonEmployee extends Employee {
    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
//    protected String getOtherInfo() {
//        return "工作：" + this.job + "\t";
//    }
}
