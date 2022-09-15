package com.zahid.localdatetimeapi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		Date d = new Date();
		d.setHours(6);
		d.setYear(120);
		System.out.println(d);
		
//		LocalDate ld = LocalDate.now();
//		LocalDate ld = LocalDate.now(Clock.systemDefaultZone());
//		LocalDate ld = LocalDate.now(ZoneId.of("Asia/Kolkata"));
//		LocalDate ld = LocalDate.now(ZoneId.of("Asia/Dhaka"));
//		LocalDate ld = LocalDate.of(1989, 9, 24);
//		LocalDate ld = LocalDate.of(1989, Month.SEPTEMBER, 24);
//		LocalDate ld = LocalDate.ofEpochDay(1000);
//		LocalDate ld = LocalDate.ofEpochDay(0);
//		LocalDate ld = LocalDate.ofEpochDay(-500);
		LocalDate ld = LocalDate.parse("2021-05-16");
		
		System.out.println(ld);
		System.out.println(ld.plusMonths(10));
		
		LocalDate d1 = ld.plusMonths(12);
		System.out.println(d1);
		System.out.println();
		
		LocalTime lt = LocalTime.now();
		
		System.out.println(lt);
		System.out.println(lt.minusHours(6));
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		System.out.println(ldt.getHour());

	}

}
