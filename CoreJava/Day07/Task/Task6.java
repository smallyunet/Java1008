/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 对学员的结业考试成绩评测，
 * 成绩>=80 ：良好， 成绩>=60 ：中等，
 * 成绩<60   ：差
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println("请输入考试成绩：");
        String flag = new Task6().result(new java.util.Scanner(System.in).nextInt());
        System.out.println("您的测评结果为：" + flag);
    }
    
    /**
     * 返回评测结果
     * @param score 分数
     */
    public String result (int score) {
       if (score >= 80) {
            return "良好";
       } else if (score >= 60) {
            return "中等";
        } else {
            return "差";
        }
    }
}
