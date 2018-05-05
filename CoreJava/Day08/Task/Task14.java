import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task14 打印九九乘法表
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}