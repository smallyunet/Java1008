/* Copyright (c) 2018 www.ychs168.com */

/**
 * 
 */
package com.ychs168.java.bean;

import java.util.List;

/**
 * @author smallyu
 * 用户信息
 */
public class User {
	private String username;
	private String pasword;
	private List<String> authlist;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public List<String> getAuthlist() {
		return authlist;
	}
	public void setAuthlist(List<String> authlist) {
		this.authlist = authlist;
	}
}
