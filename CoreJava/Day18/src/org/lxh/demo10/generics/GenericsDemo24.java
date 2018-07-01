package org.lxh.demo10.generics;

public class GenericsDemo24 {
    public static void main(String[] args) {
        Info<String> i = null;
        i = new InfoImpl<String>("李兴华");
        System.out.println("内容：" + ((InfoImpl<String>) i).getVar());
    }
}
