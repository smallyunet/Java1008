/* Copyright (c) 2018 www.ychs168.com */

/**
 * 
 */
package com.ychs168.java.bean;

/**
 * 学生类
 * @author smallyu
 * @ 2018.9.19
 */
public class Student {
	private int id;
	private String username;
	private int sex;
	
	public Student() {
		super();
	}

	public Student(int id, String username, int sex) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
}
