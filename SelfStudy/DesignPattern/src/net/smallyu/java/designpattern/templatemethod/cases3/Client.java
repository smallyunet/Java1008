package net.smallyu.java.designpattern.templatemethod.cases3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("--H1型号悍马--");
        System.out.println("H1型号的悍马是否需要喇叭声响？");
        String type = (new BufferedReader(new InputStreamReader(System.in)).readLine());
        HummerModel h1 = new HummerH1Model();
        if(type.equals("0")) {
            h1.setAlarm(false);
        }
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
