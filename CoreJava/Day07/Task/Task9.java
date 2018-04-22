/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 输入小明的考试成绩，显示所获奖励
 * 成绩==100分，爸爸给他买辆车
 * 成绩>=90分，妈妈给他买MP4
 * 90分>成绩>=60分，妈妈给他买本参考书
 * 成绩<60分，什么都不买
 *
 * @author smallyu
 * @version 1.0
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println("输入考试成绩：");
        new Task9().result(new java.util.Scanner(System.in).nextInt());
    }

    /**
     * 返回判断结果
     * @param score 考试成绩
     */
    public void result(int score) {
        switch (score / 10) {
            case 10:
                System.out.println("爸爸买辆车");
                break;
            case 9:
                System.out.println("妈妈买MP4");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("妈妈买参考书");
                break;
            default:
                System.out.println("什么都不买");
                break;
        }
    }
}
