package com.ychs168.corejava.system;

public class SystemDemo04 {
	public static void main(String[] args) {
		Person per = new Person("张三", 30);
		per = null;
		System.gc();
	}
}
