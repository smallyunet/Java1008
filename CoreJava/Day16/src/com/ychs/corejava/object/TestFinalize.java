package com.ychs.corejava.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFinalize {
	static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		Student student = new Student();
		logger.info(student);
		student = null;
		System.gc();
	}
}
