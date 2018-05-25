package net.smallyu.java.designpattern.factory.multi;

public class NvWa {
    public static void main(String[] args) {
        // 第一次造人，白人
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        // 第二次造人，黑人
        System.out.println("--造出的第一批人是白色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        // 第一三次造人，黄人
        System.out.println("--造出的第一批人是白色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
