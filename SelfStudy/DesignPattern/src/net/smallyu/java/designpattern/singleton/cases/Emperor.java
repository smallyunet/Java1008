package net.smallyu.java.designpattern.singleton.cases;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    // 使用ArrayList容纳对象的名字
    private static ArrayList<String> nameList = new ArrayList<String>();
    // 这个列表容纳对象实例
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    // 当前皇帝序列号
    private static int countNumOfEmperor = 0;
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }
    private Emperor() {

    }
    // 传入皇帝名称，建立一个对象
    private Emperor(String name){
        nameList.add(name);
    }
    // 随机获得一个对象
    public static Emperor getInstance() {
        Random random = new Random();
        // 随机拉出一个皇帝
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }
    // 皇帝说话了
    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}

/*
public class Emperor {
    private static final Emperor emperor = new Emperor();
    // 构造方法私有
    private Emperor() {

    }
    public static Emperor getInstance() {
        return emperor;
    }
    public static void say() {
        System.out.println("我就是皇帝。。。");
    }
}
*/
