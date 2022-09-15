package com.zahid.timeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeTest {

	public static void main(String[] args) {
		
//		ZonedDateTime zdt = ZonedDateTime.now();	
//		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));	
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kabul"));	
		System.out.println(zdt);
		
//		OffsetDateTime odt = OffsetDateTime.now();	
//		System.out.println(odt);
//		System.out.println(odt.toZonedDateTime());
		
		MonthDay md = MonthDay.now();
		System.out.println(md);
		System.out.println(md.getDayOfMonth());
		System.out.println(md.getMonth());
		System.out.println(md.getMonthValue());
		
		Period p = Period.of(2, 2, 10);
		System.out.println(p);
		System.out.println(p.addTo(LocalDate.now()));
		System.out.println(p.subtractFrom(LocalDate.now()));
		
		LocalDate ld1 = LocalDate.now();
//		LocalDate ld2 = LocalDate.of(1989, 9, 24);
		LocalDate ld2 = LocalDate.of(1992, 9, 24);
		
		Period age = Period.between(ld1, ld2);
		System.out.println(age);
		
		Instant i = Instant.now();
		System.out.println(i);
	}

}
