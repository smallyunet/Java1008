package org.lxh.demo12.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) {
        File f = new File("D:\\Code\\Java1008\\CoreJava\\Day18\\test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
