/* Copyright (c) 2018 www.ychs168.com */

/**
 * 
 */
package com.ychs168.java.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author smallyu
 *
 */
public class DataCenter {
	
	/**
	 * @return
	 */
	public static List<String> getClassList() {
		List<String> classList = new ArrayList<>();
		classList.add("1008");
		classList.add("1009");
		classList.add("1010");
		return classList;
	}

	/**
	 * @param classinfo
	 * @return
	 */
	public static List<String> getStudentList(String classinfo) {
		List<String> studentList = new ArrayList<>();
		Map<String, List<String>> classMap = new HashMap<>();
		List<String> classList = getClassList();
		for (int i = 0; i < classList.size(); i++) {
			List<String> tempList = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
				tempList.add("student" + (j + 1));
			}
			classMap.put(classList.get(i), tempList);
		}
		studentList = classMap.get(classinfo);
		return studentList;
	}
}
