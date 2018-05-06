/*
 * 英才汇硕 版权所有
 */

package com.ychs168.corejava;

/**
 * Task2
 * 
 * @author Administrator
 */
public class Task2 {

	/**
	 * 主方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Task2().mulTable(6);
	}

	/**
	 * 输入整数，输出每位数字，求数字和
	 * 
	 * @param num
	 * @return
	 */
	public int sum() {
		int num = new java.util.Scanner(System.in).nextInt();
		int temp = 0;
		int sum = 0;
		while (num >= 0) {
			temp %= 10;
			num /= 10;
			sum += temp;
			System.out.println(temp);
		}
		return sum;
	}

	/**
	 * 返回1到100累加和
	 * 
	 * @return
	 */
	public int sumFrom1To100() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * 求三个数最大值
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int maxFromThreeNumber(int a, int b, int c) {
		a = a > b ? a : b;
		a = a > c ? a : c;
		return a;
	}

	/**
	 * 输入两个数，判断是否相等
	 * 
	 * @return
	 */
	public boolean isEqualFromTwoData() {
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		return a == b;
	}

	/**
	 * nn乘法表
	 * 
	 * @param n
	 */
	public void mulTable(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
