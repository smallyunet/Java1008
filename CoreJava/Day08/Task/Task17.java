/*
 * 英才科技 版权所有
 */

/**
 * Task17 输出100-1000水仙花数
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task17 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (Math.pow(i / 100, 3) + Math.pow(i % 100 / 10, 3) + Math.pow(i % 10, 3) == i) {
                System.out.println(i);
            }
        }
    }
}