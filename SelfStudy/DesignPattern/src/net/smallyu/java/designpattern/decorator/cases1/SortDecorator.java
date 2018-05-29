package net.smallyu.java.designpattern.decorator.cases1;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    // 告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我排第38名。。。");
    }
    // 看完成绩单再告诉他
    public void report() {
        super.report();
        this.reportSort();
    }
}
