package net.smallyu.java.designpattern.decorator.cases1;

public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
//        SchoolReport sr = new SugarFouthGradeSchoolReport();
        // 看成绩单
//        sr.report();
        // 签名？
//        sr.sign("老三");

        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
