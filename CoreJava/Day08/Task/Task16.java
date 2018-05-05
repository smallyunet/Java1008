
/*
 * 英才科技 版权所有
 */

import java.util.Scanner;

/**
 * Task16 登录 3次机会
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i == 3 ? "没有机会了" : "你还有" + (3 - i) + "次机会");
            System.out.println("输入用户名：");
            String u = sc.next();
            System.out.println("输入密码：");
            String p = sc.next();
            if (u.equals("123") && p.equals("456")){
                System.out.println("密码正确");
                break;
            }
            System.out.println("密码错误");
        }
    }
}