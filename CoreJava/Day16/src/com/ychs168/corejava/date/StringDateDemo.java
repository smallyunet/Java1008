package com.ychs168.corejava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateDemo {
	public static void main(String[] args) throws Exception {
		String strDate = "2008-10-19 10:11:30.345";
		String pat = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(pat);
		Date d = sdf.parse(strDate);
		System.out.println(d);
	}
}
