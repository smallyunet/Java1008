package com.ychs.corejava.object;

public class ObjectMethod {

	public String showObjectClass(Object obj) {
		return obj.getClass().getName();
	}
	
	public int showHashCode(Object obj) {
		return obj.hashCode();
	}
}
