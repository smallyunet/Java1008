/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson10;

/**
 * 工人类
 * 
 * @author smallyu
 * @version 1.0
 */
public class Worker extends Person {    // 继承的语法规则
    int wage;
    public static void main(String[] args) {
        System.out.println(new Worker().name);
    }
}