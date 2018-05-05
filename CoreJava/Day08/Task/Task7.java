/*
 * 英才科技 版权所有
 */

/**
 * Task7
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0) {
                sum++;
            }
        }
        System.out.println("sum: " + sum);
    }
}