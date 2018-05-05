/*
 * 英才科技 版权所有
 */

import java.util.Scanner;

/**
 * Task2
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}