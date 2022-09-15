package com.zahid.datetimefomatterapi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatterTest {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
//		ZonedDateTime dt = ZonedDateTime.now();
		System.out.println(dt);
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		
		System.out.println(dtf.format(dt));
		
		String str = dtf.format(dt);
		System.out.println(str);
		
		System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
		System.out.println(dt.get(ChronoField.ERA));
		System.out.println(dt.get(ChronoField.YEAR));
		System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));

	}

}
