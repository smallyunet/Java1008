/**
 * 已知三个数，输出和
 */
class Task1 {
    public static void main(String[] args) {
        System.out.println(12 + 23 + 67.8);
    }
}

/**
 * 分析程序运行结果
 */
class Task2 {
    public static void main(String[] args) {
        int a = 4;
        int b = a++;
        int c = --b + a++;
        // boolean d = c < 10 && a-- > 5 & b++ || --c;  // 有错
        boolean d = c < 10 && a-- > 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

/**
 * 输入圆的半径，输出面积和周长
 */
class Task3 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        double r = new java.util.Scanner(System.in).nextDouble();
        System.out.println("圆的半径：" + 4 * 3.14 * r * r + "; 圆的周长：" + 2 * 3.14 * r);
    }
}

/**
 * 输入矩形的宽高，输出面积和周长
 */
class Task4 {
    public static void main(String[] args) {
        System.out.println("请输入矩形的长：");
        double w = new java.util.Scanner(System.in).nextDouble();
        System.out.println("请输入矩形的宽：");
        double h = new java.util.Scanner(System.in).nextDouble();
        System.out.println("矩形的面积：" + w * h + "; 矩形的周长：" + 2 * (w + h));
    }
}

/**
 * 打印指定信息
 */
class Task5 {
    public static void main(String[] args) {
        System.out.println("******************商城库存清单******************");
        System.out.println("品牌型号\t 尺寸\t 价格\t\t 库存量 ");
        System.out.println("Mac\t\t 13.3\t 6988.00\t 5 ");
        System.out.println("ThinkPad\t 14.0\t 5999.00\t 10 ");
        System.out.println("ASUA\t\t 15.6\t 4999.5\t\t 12 ");
        System.out.println("***********************************************");
    }
}
