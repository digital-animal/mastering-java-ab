package com.zahid.dateapi;

import java.util.Date;

public class DateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
//		long years = ((System.currentTimeMillis() / 1000) / (86400)) / 365;
		Long years = System.currentTimeMillis() / 1000 / 86400 / 365;
		System.out.println(years);
		System.out.println(Long.MAX_VALUE);
		
		Long totalYears = 9223372036854775807L / 1000 /86400 /365;
		System.out.println(totalYears);
		
//		Date d = new Date(System.currentTimeMillis());
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		System.out.println(d.getYear()+1900);
		System.out.println(d.getTime());
		System.out.println(d.getTimezoneOffset());
		System.out.println();
		
		Date d1 = new Date("24/9/1989");
		System.out.println(d1);

	}

}
