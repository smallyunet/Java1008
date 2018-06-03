package com.ychs168.corejava.system;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "姓名：" + this.name + "，年龄；" + this.age;
	}
	public void finalize() throws Throwable {
		System.out.println("对象被释放  ==> " + this);
	}
}
