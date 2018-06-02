package com.ychs.corejava.exception;

public class ThrowDemo {
    public void calc() {
        int a = 9;
        int b = 3;
        double c = 0.0;
    
        if(b == 0) {
            throw new ArithmeticException();
        } else {
            c = a / b;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        ThrowDemo tDemo = new ThrowDemo();
        tDemo.calc();
    }
}