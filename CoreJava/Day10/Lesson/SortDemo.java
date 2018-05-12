/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson10;

import java.util.Arrays;

/**
 * 数组排序方法
 * 
 * @author smallyu
 * @version 1.0
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] array = { 80, 60, 10, 5 };
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}