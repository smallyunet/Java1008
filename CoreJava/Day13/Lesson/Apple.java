public class Apple {
    double num;
    private static Apple app = null;
    private Apple() {
        num = Math.random();
    }
    public static Apple getApple() {
        if (app == null) {
            app = new Apple();
        }
        return app;
    }
    public double getNum() {return num;}
}

class Test {
    public static void main(String[] args) {
        Apple a1 = Apple.getApple();
        System.out.println(al.getNum());
        Apple a2 = Apple.getApple();
        System.out.println(a2.getNum());
    }
}