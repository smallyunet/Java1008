package com.ychs.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jTest {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger();
		logger.info("hello");
	}
}
