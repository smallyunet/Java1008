/*
 * 英才科技 版权所有
 */

import java.util.Scanner;

/**
 * Demo04
 * 
 * @author smallyu
 * @version 1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int input = 0;
        while(true){
            input = sc.nextInt();
            if(input > max) {
                max = input;
            }
            if(input == -1) {
                System.out.println("max: " + max);
                break;
            }
        }
    }
}