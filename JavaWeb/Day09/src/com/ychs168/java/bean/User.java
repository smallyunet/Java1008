/* Copyright (c) 2018 www.ychs168.com */

/**
 * 
 */
package com.ychs168.java.bean;

/**
 * @author smallyu
 *
 */
public class User {
	private int id;
	private String name;
	private int age;
	
	public User() {
		super();
	}

	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
