/*
 * 英才汇硕 版权所有
 */

package com.ychs168.corejava;

/**
 * Task
 * 
 * @author Administrator
 */
public class Task {

	/**
	 * 主方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Task().add(1, 2);
	}

	/**
	 * 返回最大值
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int maxNumber(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * 返回两数和
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * 判断是否为素数
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrimeNumber(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 计算圆的面积
	 * 
	 * @param r
	 * @return
	 */
	public double area(int r) {
		return 3.14 * r * r;
	}

	/**
	 * 重载add方法
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public double add(int num1, double num2) {
		return num1 + num2;
	}
}
