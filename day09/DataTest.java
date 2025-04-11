package com.shinhan.day09;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import com.shinhan.util.DateUtil;

//Date, Calendar, java.sql.Date
public class DataTest {

	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		java.sql.Date d1 = (java.sql.Date) new Date();
		System.out.println(d1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		String str = sdf.format(d1); //날짜 -> 문자
		System.out.println(str);
		
		str = DateUtil.converToString(d1);
		System.out.println(str);
		
		String str2 = "2025-04-11 03:44:19";
		try {
			Date d2 = sdf.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date d2 = DateUtil.converToDate(str2);
		System.out.println(d2);
		
		//util.Date -> sql.Date로 바꾸기
		java.sql.Date d3 = DateUtil.convertToSQLDate(d1);
		System.out.println(d3);
	
	}

	private static void f5() {
		double su = -1000000.12345678;
		DecimalFormat df = new DecimalFormat("000,000,000,000");
		DecimalFormat df2 = new DecimalFormat("###,###,###,###");
		DecimalFormat df3 = new DecimalFormat("###,###,###,###;-###,###,###,###");
		System.out.println(df.format(su));
		System.out.println(df2.format(su));
		System.out.println(df3.format(su));
	}

	private static void f4() {
		java.sql.Date d = new java.sql.Date(new Date().getTime());
		System.out.println(d);

		// util의 데이터를 주면 sql데이터로 바꿔라
		java.sql.Date d2 = call(new Date().getTime());
		System.out.println(d2);
	}

	private static java.sql.Date call(long time) {

		return new java.sql.Date(time);
	}

	private static void f3() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonth());
	}

	private static void f2() {
		Calendar cal = Calendar.getInstance(); // Calendar는 생성자없음
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
	}

	private static void f1() {
		Date d1 = new Date();
		System.out.println(d1.getYear());
		System.out.println(d1.getTime());

		Date d2 = new Date(1744352455500L);
		System.out.println(d2);
	}

}
