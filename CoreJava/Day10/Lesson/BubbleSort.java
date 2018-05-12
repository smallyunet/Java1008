/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson10;

/**
 * 冒泡排序
 * 
 * @author smallyu
 * @version 1.0
 */
public class BubbleSort {
    /**
     * 实现冒泡排序
     * 
     * @param array 原始数组
     * @return 排序以后的数组
     */
    public int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j] + 1) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 80, 60, 10, 5 };
        BubbleSort bs = new BubbleSort();
        array = bs.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}