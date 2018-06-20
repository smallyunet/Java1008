package com.ychs.corejava.object;

public class Student {
	
	@Override
	public void finalize() {
		System.out.println("student对象被回收时调用的...");
	}
}
