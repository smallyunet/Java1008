package com.ychs.lesson;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        // -
        for (String s : list) {
            System.out.println(s);
        }
        // -
        list.forEach((s) -> System.out.println(s));
        // -
        list.forEach(System.out::println);
    }
}
