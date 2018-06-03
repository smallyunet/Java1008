package com.ychs168.corejava.stringbuffer;

public class StringBufferDemo09 {
	public static void main(String[] args) {
		String str1 = "LiXingHua";
		for(int i = 0; i < 100; i++) {
			str1 += i;
		}
		System.out.println(str1);
	}
}
