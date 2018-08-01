package com.ychs.lesson;

import java.util.ResourceBundle;

public class BundleDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        String driver = bundle.getString("driver");

        System.out.println(driver);
    }
}
