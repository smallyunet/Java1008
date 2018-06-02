/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

import java.util.Scanner;
/**
 * 任务2 需求说明：
 * 按照控制台提示输入1～3之间任一个数字，程序将输出相应的课程名称
 * 根据键盘输入进行判断。如果输入正确，输出对应课程名称。如果输入错误，给出错误提示
 * 不管输入是否正确，均输出“欢迎提出建议”语句
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~3之间任一数字");
        int temp = sc.nextInt();
        try {
            if(temp >= 1 && temp <= 3) {
                System.out.println("输入的数字是：" + temp);
            } else {
                throw new Task2Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}

class Task2Exception extends Exception {
    public Task2Exception() {
        System.out.println("输入错误，请输入1~3之间的数字");
    }
}
