/*
 * @(#)PersonTest.java 2018-04-14
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */

/**
 * PersonTest
 * @author smallyu
 * @version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Persion(21, "zhangsan", "ty");
        System.out.println(p);
        PersonTest pt = new PersonTest();
        pt.test1(p);
    }

    public void test1(Person per) {
        // Person px = per;
        per = new Person(18, "list", "shandong");
    }
}

/**
 * Person
 * @author smallyu
 * @version 1.0
 */
class Person {
    int age = 19;
    String name = "hello";
    String addr;

    public Person(){}

    public Person(int a,String n,String ad) {
        age = a;
        name = n;
        addr = ad;
    }
}