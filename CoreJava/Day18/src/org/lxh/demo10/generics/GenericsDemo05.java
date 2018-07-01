package org.lxh.demo10.generics;

public class GenericsDemo05 {
    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();

        p.setVar(30);
        System.out.println(p.getVar() * 2);
    }
}
