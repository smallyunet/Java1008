/*
 * 英才科技 版权所有
 */

/**
 * Task18 输出所有四叶玫瑰数
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task18 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (Math.pow(i / 1000, 4) + Math.pow(i % 1000 / 100, 4) + Math.pow(i % 100 / 10, 4) + Math.pow(i % 10, 4) == i) {
                System.out.println(i);
            }
        }
    }
}