
/*
* @(#)ReceiveKey.java 2018-04-14
* 
* Copyright 2018 英才汇硕信息科技有限公司
*/

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * ReceiveKey
 * @author smallyu
 * @version 1.0
 */
public class ReceiveKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("加法计算结果：" + (a + b));
        String s = sc.next();
        System.out.println(s);
    }
}