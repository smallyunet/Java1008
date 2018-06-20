package org.lxh.demo9.threaddemo;

public class ThreadCaseDemo01 {
    public static void main(String[] args) {
        Info i = new Info();
        Producer pro = new Producer(i);
        Consumer con = new Consumer(i);
        new Thread(pro).start();
        new Thread(con).start();
    }
}
