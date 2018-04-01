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
    }
}
