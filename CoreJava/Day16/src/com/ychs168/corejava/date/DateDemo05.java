package com.ychs168.corejava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo05 {
	public static void main(String[] args) {
		String strDate = "2008-10-19 10:11:30.345";
		String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";
		String pat2 = "yyyy年MM月dd日HH时mm分ss秒sss毫秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2= new SimpleDateFormat(pat2);
		Date d = null;
		try {
			d = sdf1.parse(strDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
}






