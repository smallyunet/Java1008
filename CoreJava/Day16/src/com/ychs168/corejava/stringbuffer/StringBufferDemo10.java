package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo10 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("LiXingHua");
		for (int i = 0; i < 100; i++) {
			buf.append(i);
		}
		System.out.println(buf);
	}
}
