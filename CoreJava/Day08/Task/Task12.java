import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task12 猜数字
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // [0,1) * 100 = [0, 100)
        int num = (int) (Math.random() * 100);
        int num2 = 0;
        int count = 0;
        do {
            num2 = sc.nextInt();
            if (num2 > num) {
                System.out.println("大了");
            } else if (num2 < num) {
                System.out.println("小了");
            } else {
                System.out.println("对了");
            }
            count++;
        } while (num2 != num);
        System.out.println(count + "次");
    }
}