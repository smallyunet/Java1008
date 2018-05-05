/*
 * 英才科技 版权所有
 */

/**
 * Task8
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            if((i % 7 == 0) && (i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}