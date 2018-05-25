package net.smallyu.java.designpattern.factory.cases;

public class NvWa {
    public static void main(String[] args) {
        // 声明八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        // 第一次造人，白人
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 第二次造人，黑人
        System.out.println("--造出的第一批人是白色人种--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 第一三次造人，黄人
        System.out.println("--造出的第一批人是白色人种--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
