/*
 * 英才科技 版权所有
 */

import java.util.Scanner;

/**
 * Task3
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int times = 0;
        while(i <= 100) {
            if(i % 7 == 0) {
                System.out.print(i + "\t");
                times++;
                if(times == 5) {
                    System.out.println();
                    times = 0;
                }
            }
            i++;
        }
    }
}