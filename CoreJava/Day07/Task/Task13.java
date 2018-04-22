/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 张三为他的手机设定了自动拨号
 * 按1：拨爸爸的号
 * 按2：拨妈妈的号
 * 按3：拨爷爷的号
 * 按4：拨奶奶的号
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.println("输入按键：");
        new Task13().result(new java.util.Scanner(System.in).nextInt());
    }

    /**
     * 输出结果
     * @param score 按键
     */
    public void result(int score) {
        switch (score) {
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;
            default:
                System.out.println("未设置");
                break;
        }
    }
}
