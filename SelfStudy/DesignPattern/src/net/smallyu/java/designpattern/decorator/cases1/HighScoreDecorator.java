package net.smallyu.java.designpattern.decorator.cases1;

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试成绩最高。。。");
    }
    // 在看成绩单前告诉他最高成绩
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
