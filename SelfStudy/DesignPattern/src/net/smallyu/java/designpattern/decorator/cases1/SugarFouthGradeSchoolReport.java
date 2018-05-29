package net.smallyu.java.designpattern.decorator.cases1;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    // 定义要美化的而方法，说学校的最高成绩
    private void reportHighScore() {
        System.out.println("这次考试成绩最高是。。。");
    }
    // 回报学校排名情况
    private void reportSort() {
        System.out.println("我的排名是。。。");
    }
    // 汇报内容已经改变，重写父类
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
