/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 任务1 需求说明：
 * 在 setAge(int age) 中对年龄进行判断，如果年龄介于1到100直接赋值，否则抛出异常
 * 在测试类中创建对象并调用 setAge(int age) 方法，使用 try-catch 捕获并处理异常
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task1 {
    private int age = 0;
    public void setAge(int age) throws Exception {
        if(age >= 1 && age <= 100) {
            this.age = age;
        } else {
            throw new Exception();
        }
    }
}

class Test {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        try {
            t1.setAge(50);
            t1.setAge(150);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}