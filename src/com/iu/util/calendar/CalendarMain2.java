package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();

		birth.set(Calendar.YEAR, 1995);
		birth.set(Calendar.MONTH, 9);
		birth.set(Calendar.DATE, 5);
		
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
		long result = n-b;
		
		result = result/(1000*60*60*24)/365;
		
		System.out.println(result);
		
		//Callendar 타입을 Date 타입으로 변경
		Date date = now.getTime();
		System.out.println(date);
		
		
		
		
		
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f-n;		
//		System.out.println(result);
//		System.out.println(result/1000);
//		System.out.println(result/60000);

	}

}
