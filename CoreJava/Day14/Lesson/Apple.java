public interface Apple {
    void a();
}
class AX implements Apple {
    public void a() {System.out.println("111111");}
}
class FuShi implements Apple {
    public void a() {System.out.println("ychs");}
    void b() {}
    public static void main(String[] args) {
        Apple ap = new AX();
        ap.a();
        // ap.b();
    }
}