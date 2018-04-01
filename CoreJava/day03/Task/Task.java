/*
 * @(#)Task.java 2018-04-01
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

/**
 * Class <code> Task1 </code> 输出指定内容
 * 
 * @author smallyu
 * @version 1.0
 */
class Task1 {
    double maxScore = 98.5;
    String name = "张三";
    String gender = "男";
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.maxScore);
        System.out.println(task.name);
        System.out.println(task.gender);
    }
}

/**
 * Class <code> Task2 </code> 输出指定内容
 * 
 * @author smallyu
 * @version 1.0
 */
class Task2 {
    String brand = "爱国者F928";
    double weight = 12.4;
    String type = "内置锂电池";
    int price = 499;
    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(task.brand);
        System.out.println(task.weight);
        System.out.println(task.type);
        System.out.println(task.price);
    }
}
