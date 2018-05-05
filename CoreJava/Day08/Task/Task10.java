import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task10
 * 5门课，平均值
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
        }
        for (int i : list) {
            sum += i;
        }
        System.out.println("平均" + sum / 5);
    }
}