import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task11
 * 输入整数，打印出各位数字
 * 没有计算各位数字和
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task11 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int num2 = num;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("每位数字分别为：");
        for (int i = 1; i < count; i++) {
            System.out.println((int) (num2 / Math.pow(10, count - i)));
            num2 %= Math.pow(10, count - i);
        }
        System.out.println(num2);
    }
}