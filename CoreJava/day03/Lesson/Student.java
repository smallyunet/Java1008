/*
    英才科技版权所有 2018
*/
/**
    类的语法示例
    @author smallyu
    @version 1.0 2018-04-01
*/
class Student {
    String name;
    int age = 22;
    double height;
    String gender = "女";

    public Student() {} // 构造方法
    public void Student() {}  // 普通方法，因为有返回类型

    public Student(String n, int a) { // 允许存在多个构造方法，参数必须不同
      name = n;
      age = a;
    }

    public Student(String n, int a, double h, String g) {
      name = n;
      age = a;
      height = h;
      gender = g;
    }

    public void sayHello() {
      System.out.println("你好");
    }
    public String bite() {
      System.out.println("被咬了！");
      return "疼！";
    }
    public String bite1(String name) {
      System.out.println(name + "被咬了！");
      return name + "说：疼！";
    }

    public static void main(String[] args) {
      Student smallyu = new Student();
      smallyu.sayHello();

      String result1 = smallyu.bite();
      System.out.println(result1);

      String result2 = smallyu.bite1("我");
      System.out.println(result2);

      Student user1 = new Student("user1", 25); // 传入初值
      System.out.println(user1.name);
      System.out.println(user1.age);
      System.out.println(user1.height);
      System.out.println(user1.gender);

      Student user2 = new Student("user2", 30, 1.70, "男");
      System.out.println(user2.name);
      System.out.println(user2.age);
      System.out.println(user2.height);
      System.out.println(user2.gender);
    }
}
