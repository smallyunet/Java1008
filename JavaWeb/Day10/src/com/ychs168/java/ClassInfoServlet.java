package com.ychs168.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassInfoServlet
 */
public class ClassInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClassInfoServlet() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String college = request.getParameter("college");
		List<String> classInfo = getClassInfo(college);
		String result = getXML(classInfo);
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * 根据班级获取XML
	 * @param classInfo
	 * @return
	 */
	private String getXML(List<String> classInfo) {
		StringBuffer sbf = new StringBuffer();
		/*
		 * <class>
		 * 	<id>1</id>
		 *  <name>abc</name>
		 * </class>
		 */
		sbf.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
		sbf.append("<classinfo>");
		for (int i = 0; i < classInfo.size(); i++) {
			sbf.append("<class>");
			sbf.append("<id>" + i + "</id>");
			sbf.append("<name>" + classInfo.get(i) + "</name>");
			sbf.append("</class>");
		}
		sbf.append("</classinfo>");
		return sbf.toString();
	}
	
	/**
	 * 根据学校获取班级
	 * @param college
	 * @return
	 */
	private List<String> getClassInfo(String college) {
		List<String> result = new ArrayList<>();
		
		Map<String, List<String>> colleges = new HashMap<>();
		List<String> value = new ArrayList<>();
		value.add("lixue001");
		value.add("lixue002");
		value.add("lixue003");
		colleges.put("lixuexi", value);
		
		value = new ArrayList<>();
		value.add("dianzi001");
		value.add("dianzi002");
		value.add("dianzi003");
		colleges.put("dianzi", value);
		
		value = new ArrayList<>();
		value.add("ruangong001");
		value.add("ruangong002");
		value.add("ruangong003");
		colleges.put("ruangong", value);
		
		result = colleges.get(college);
		return result;
	}

}
