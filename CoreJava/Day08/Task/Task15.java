/*
 * 英才科技 版权所有
 */

import java.util.Scanner;

/**
 * Task15 三个班，每个班4个学生，分别计算每个班平均分
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {0, 0, 0};
        for (int i = 1; i < 4; i++) {
            int num = 0;
            for (int j = 1; j < 5; j++) {
                System.out.print(i + "班 第" + j + "位学生的成绩：");
                num += sc.nextInt();
                list[i - 1] = num;
            }
        }
        System.out.println("三个班平均分分别：");
        for(int i : list) {
            System.out.println(i);
        }
    }
}