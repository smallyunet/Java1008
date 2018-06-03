package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo02 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello");
		fun(buf);
		System.out.println(buf);
	}
	public static void fun(StringBuffer s) {
		s.append("MLDN").append("LiXingHua");
	}
}
