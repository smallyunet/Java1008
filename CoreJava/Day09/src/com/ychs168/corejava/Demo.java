package com.ychs168.corejava;

public class Demo {
	public static void main(String[] args) {
		new Demo().fn(6);
	}

	/**
	 * �ݹ飬�׳�
	 * 
	 * @param n
	 * @return
	 */
	public int fn(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fn(n - 1);
	}
}
