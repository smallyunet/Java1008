/*
 * 英才科技 版权所有
 */

package com.ychs.corejava.lesson10;

import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

/**
 * 数组查找任务 
 * 1. 给定数组，在数组中指定数字出现的次数 
 * 2. 给定数组，在数组中指定数字出现的次数及索引
 * 3. 对数组排序，从大到小 
 * 4. 给定数组，输出重复出现的数字和次数
 * 5. 给定数组，输出重复出现的数字及其索引
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task1 {
    
    /**
     * 主方法
     */
    public static void main(String[] args) {
        int[] array = {2,2,3,3,3,4,9,5,4,2,3,4,6,0,5,0,5,5,8};
        Task1 ts1 = new Task1();
        // 1. 给定数组，在数组中指定数字出现的次数 Test
        System.out.println(ts1.numberTimes(array, 5));
        System.out.println(ts1.numberTimes2(array, 5));
        // 2. 给定数组，在数组中指定数字出现的次数及索引
        ts1.numberTimesAndIndex(array, 5);
        // 4. 给定数组，输出重复出现的数字和次数
        ts1.repeatNumber(array);
        // 5. 给定数组，输出重复出现的数字及其索引
        ts1.repeatNumberWithIndex(array);
    }

    /**
     * 1. 给定数组，在数组中指定数字出现的次数 方法1
     */
    public int numberTimes(int[] array, int number) {
        // 遍历数组
        int times = 0;
        for (int i : array) {
            if (number == i) {
                times++;
            }
        }
        return times;                        
    }

    /**
     * 1. 给定数组，在数组中指定数字出现的次数 方法2
     */
    public int numberTimes2(int[] array, int number) {
        // 桶排序过程得到的数组
        int[] timesAndIndex = new int[10];
        for (int i : array) {
            timesAndIndex[i]++;
        }
        // 在数组中查找出对应次数
        return timesAndIndex[number];
    }

    /**
     * 2. 给定数组，在数组中指定数字出现的次数及索引
     * 
     * 索引长度是不定的，所以使用TreeSet
     * 为了省事，不返回值，直接打印
     */
    public void numberTimesAndIndex(int[] array, int number) {
        Set<Integer> indexSet = new TreeSet<Integer>();
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                indexSet.add(i);
                times++;
            }
        }
        System.out.println(number + "在数组中一共出现" + times + "次");
        System.out.println(indexSet);
    }

    /**
     * 3. 对数组排序，从大到小
     */
    public int sortFromBigToSmall(int[] array, int number) {
        return 0;
    }

    /**
     * 4. 给定数组，输出重复出现的数字和次数
     */
    public void repeatNumber(int[] array) {
        int[] times = new int[10];
        // 数值范围：0 - 9
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    times[i]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (times[i] != 0) {
                System.out.println(i + " 在数组中一共出现 " + times[i] + "次");
            }
        }
    }

    /**
     * 5. 给定数组，输出重复出现的数字及其索引
     */
    public void repeatNumberWithIndex(int[] array) {
        // 保存所有值的索引
        Map<Integer, TreeSet> indexMap = new TreeMap<Integer, TreeSet>();
        // 数值范围：0 - 9
        for (int i = 0; i < 10; i++) {
            TreeSet<Integer> indexSet = new TreeSet<Integer>();
            // 每一次内循环，遍历出一个数的索引
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    indexSet.add(j);
                }
            }
            // i为在寻找的数，indexSet为索引列表
            indexMap.put(i, indexSet);
        }
        // 遍历indexMap输出
        Set<Integer> keys = indexMap.keySet();
        Iterator iter = keys.iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            TreeSet value = indexMap.get(key);
            // 值不为空，则输出
            if (!value.isEmpty()) {
                System.out.println(key + " --> " + value);
            }
        }
    }
}
