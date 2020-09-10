package com.hamit.calendarx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarClass {

	public static void main(String[] args) {

		Calendar calendar2 = Calendar.getInstance(Locale.FRANCE);
		System.out.println(calendar2.getTime());

		int x = 5;
		calendar2.add(Calendar.HOUR, x);
		System.out.println(calendar2.getTime());

		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd - MMMM - EEEE  yyyy hh:ss:mm zzzz", locale);
		Calendar calendar = new GregorianCalendar();
		simpleDateFormat.setTimeZone(calendar.getTimeZone());
		System.out.println(simpleDateFormat.format(calendar.getTime()));
	}

}
