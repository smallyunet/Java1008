/*
 * 英才科技 版权所有
 */

/**
 * Task19 输出所有分段和平方数
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task19 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (Math.pow(i / 100, 2) + Math.pow(i % 100, 2) == i) {
                System.out.println(i);
            }
        }
    }
}