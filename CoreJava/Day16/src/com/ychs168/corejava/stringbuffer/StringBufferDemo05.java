package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo05 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello").append("World!");
		buf.replace(6, 11, "LiXingHua");
		System.out.println("内容替换之后的结果是：" + buf);
	}
}
