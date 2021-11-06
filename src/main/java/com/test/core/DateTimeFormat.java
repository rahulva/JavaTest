package com.test.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
	public static void main(String[] args) {
		String DATE_TIME_FORMATTER = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter FORMATER = DateTimeFormatter.ofPattern(DATE_TIME_FORMATTER);
		LocalDateTime dateTime = LocalDateTime.parse("2018-12-28 01:29:02", FORMATER);
		System.out.println(dateTime);
	}
}
