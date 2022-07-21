package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
//		Calendar ca = new GregorianCalendar();
		//현재 년월일시분초밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25);
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH); //월은 0부터 시작
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		long milis = ca.getTimeInMillis();
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(milis);

	}

}
