/*
 * 英才科技 版权所有
 */

/**
 * Task20 求1到5阶乘的和
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task20 {
    public static void main(String[] args) {
        int sum = 0;
        Task20 t = new Task20();
        for (int i = 1; i <= 5; i++) {
            sum += t.op(i);
        }
        System.out.println(sum);
    }

    public int op(int i) {
        int sum = 1;
        while (i > 0) {
            sum *= i;
            i--;
        }
        return sum;
    }
}