import java.util.Scanner;

/*
 * 英才科技 版权所有
 */

/**
 * Task22 剪刀石头布游戏，赢两次结束
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task22 {
    /**
     * 主方法，主要逻辑
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task22 t = new Task22();
        int times = 0;
        do {
            System.out.println("剪刀1，石头2，布3：");
            int user = sc.nextInt();
            int sys = (int) (1 + Math.random() * 3);
            System.out.println("系统选择了" + t.alter(sys) + "\t你选择了" + t.alter(user));
            if (t.rule(user, sys)) {
                System.out.println("赢了\n");
                times++;
            } else {
                System.out.println("输了\n");
            }
        } while (times <= 2);
    }

    /**
     * 胜负判决
     */
    public boolean rule(int user, int sys) {
        switch (user) {
        case 1:
            if (sys == 3)
                return true;
            return false;
        case 2:
            if (sys == 1)
                return true;
            return false;
        case 3:
            if (sys == 2)
                return true;
            return false;
        default:
            return false;
        }
    }

    /**
     * 数字对应到字符串的转换
     */
    public String alter(int num) {
        switch (num) {
        case 1:
            return "剪刀";
        case 2:
            return "石头";
        case 3:
            return "布";
        default:
            return "";
        }
    }
}