import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task13 打印三角形
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task13 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}