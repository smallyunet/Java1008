package com.ychs168.java.lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("china");
        strList.add("hello");
//        strList.add(200);
        System.out.println(strList);

        for (String i : strList) {
            System.out.println(i);
        }

        Set strSet = new HashSet();
        strSet.add("hello");
        strSet.add("world");
        strSet.add("hello");
        strSet.add(200);
        System.out.println(strSet);
    }
}
