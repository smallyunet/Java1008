package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo07 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World!");
		buf.replace(6, 11, "LiXingHua");
		String str = buf.delete(6,15).toString();
		System.out.println("删除之后的内容：" + str);
	}
}
