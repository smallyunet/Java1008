/*
 * 英才科技 版权所有
 */

package com.ychs168.corejava;

/**
 * 买彩票，如果体彩中了500万，我买车、资助希望工程、去欧洲旅游
 * 如果没中，我买下一期体彩，继续烧高香
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task4 {
    public static void main(String[] args) {
        boolean result = true;
        new Task4().award(result);
    }
    
    /**
     * 判断奖励内容
     * @param result 是否中奖
     */
    public void award (boolean result) {
        if (result) {
            System.out.println("我买车、资助希望工程、去欧洲旅游");
        } else {
            System.out.println("我买下一期体彩，继续烧高香");
        }
    }
}
