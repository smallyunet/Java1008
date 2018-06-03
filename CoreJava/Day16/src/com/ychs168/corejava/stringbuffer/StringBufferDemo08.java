package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo08 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World!");
		if(buf.indexOf("Hello") == -1) {
			System.out.println("没有查找到指定的内容");
		} else {
			System.out.println("可以查找到指定的内容");
		}
	}
}
