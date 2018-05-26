public class Device {
    public void test() {System.out.println("hello");}
}
class Computer extends Device {
    public void test() {System.out.println("xdf");}
}
class Test {
    public static void main(String[] args) {
        Device d = new Device();
        d.test();
        Device d1 = new Computer();
        d1.test();
        Computer c = new Computer();
        c.test();
    }
}