package com.ychs.corejava.lesson11;

// this使用注意事项
public class Cup {
    String name;
    int capacity;

    public Cup(String name, int capacity) {
        String name;
        int capacity;

    }

    public static void main(String[] args) {
        Cup cp = new Cup("富光",3 50);
        System.out.println(cp.name + " " + cp.capacity);
    }
}