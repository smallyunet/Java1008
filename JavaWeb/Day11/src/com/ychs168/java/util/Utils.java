/* Copyright (c) 2018 www.ychs168.com */

/**
 * 
 */
package com.ychs168.java.util;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 工具类
 * @author smallyu
 *
 */
public class Utils {
	public static String getJSON(List<Object> list) throws JsonGenerationException, JsonMappingException, IOException {
		if (list == null) {
			return "";
		}
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);
		json = "{\"code\":0,\"msg\":\"\",\"count\":rows,\"data\":" + json + "}";
		json = json.replaceAll("rows", "" + list.size());
		return json;
	}
}
