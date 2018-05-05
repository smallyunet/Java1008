/*
 * 英才科技 版权所有
 */

/**
 * Task6
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 20; i >= 1; i--) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            sum += i;
        }
        System.out.println("sum: " + sum);
    }
}