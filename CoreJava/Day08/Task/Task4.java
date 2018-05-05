/*
 * 英才科技 版权所有
 */

/**
 * Task4
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task4 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        do {
            if(i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 200);
        System.out.println(sum);
    }
}