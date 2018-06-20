package org.lxh.demo12.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) {
        String path = "D:" + File.separator + "test.txt";
//        System.out.println(path);
        File f = new File(path);
//        try {
//            f.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
