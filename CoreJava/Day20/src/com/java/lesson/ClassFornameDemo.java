package com.java.lesson;

public class ClassFornameDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.java.lesson.ClassFornameTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ClassFornameTest.fuc();
    }
}
