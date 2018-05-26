/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson14;

/**
 * Person
 * 
 * @author smallyu
 * @version 1.0
 */
public class Person {
    int age = 21;
    public int getAge() {return age;}
}
class Student extends Person {

}
class Teacher extends Person {}
class Test {
    /*
        public void a(Student s) {
            System.out.println(s.getAge());
        }
        public void b(Teacher t) {
            System.out.println(t.getAge());
        }
    */
    public void c(Person p) {
        System.out.println(p.getAge());
    }
    public static void main(String[] args) {
        Test t = new Test();
        Student s = new Student();
        t.c(s);
        t.c(new Person());
        t.c(new Teacher());
    }
}