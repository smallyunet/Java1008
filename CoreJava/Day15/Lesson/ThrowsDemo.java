package com.ychs.corejava.exception;

import sun.text.resources.cldr.nmg.FormatData_nmg;

public class ThrowsDemo {
    public static void test() throws ArithmeticException, ClassNotFoundException {
        Class.forName("");
        int c = 3 / 0;
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}