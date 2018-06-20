package com.ychs.corejava.object;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestObjectMethod {
	Logger logger = LogManager.getLogger();
	ObjectMethod om = new ObjectMethod();

	@Test
	public void testShowObjectClass() {
		logger.info("字符串ychs对应的类是：" + om.showObjectClass("ychs"));
		logger.info("new Date()创建的对象对应的类是：" + om.showObjectClass(new Date()));
		
		Student student = new Student();
		logger.info("student对应的类是：" + om.showObjectClass(student));
	}
	
	@Test
	public void testShowHashCode() {
		logger.info("字符串China对应的hashcode是：" + om.showHashCode("China"));
		logger.info("student对应的hashcode是：" + om.showHashCode(new Student()));
		
	}
	
}
