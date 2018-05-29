package net.smallyu.java.designpattern.decorator.cases1;

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        // 成绩单的格式
        System.out.println("尊敬的家长：");
        System.out.println("。。。");
        System.out.println("语文 26 数学 32");
        System.out.println("。。。");
        System.out.println("家长签名");
    }

    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
