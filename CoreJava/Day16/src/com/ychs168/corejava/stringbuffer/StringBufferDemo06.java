package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo06 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World!");
		buf.replace(6, 11, "LiXingHua");
		String str = buf.substring(6,15);
		System.out.println("截取之后的内容：" + str);
	}
}
