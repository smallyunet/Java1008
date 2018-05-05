import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task21 输出商品价格
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            input = sc.next();
            if (!input.equals("n")) {
                System.out.println("输入了 " + input + " 将会返回对应商品价格");
            }
        } while (!input.equals("n"));
    }
}