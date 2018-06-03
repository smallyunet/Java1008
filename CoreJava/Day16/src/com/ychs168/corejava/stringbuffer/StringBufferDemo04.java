package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo04 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("World!");
		buf.insert(0, "Hello");
		String str = buf.reverse().toString();
		System.out.println(str);
	}
}
