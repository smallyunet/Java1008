package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo01 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello");
		
		buf.append("World").append("!!!");
		buf.append("\n");
		buf.append("数字 = ").append(1).append("\n");
		buf.append("字符 = ").append('c').append("\n");
		buf.append("布尔 = ").append(true);
		System.out.println(buf);
	}
}
