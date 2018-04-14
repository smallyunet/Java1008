/*
 * @(#)Memory.java 2018-04-14
 * 
 * Copyright 2018 英才汇硕信息科技有限公司
 */
/**
 * Memory
 * @author smallyu
 * @version 1.0
 */
public class Memory {
    public int half(int a) {
        System.out.println(a);
        int m = a / 2;
        System.out.println(a);
        return m;
    }
    public static void main(String[] args) {
        int a = 190;
        Memory ma = new Memory();
        int x = ma.half(a);
        System.out.println(a);
        System.out.println(x);
    }
}