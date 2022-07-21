package com.iu.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.getTime());
		
//		ca.roll(Calendar.MINUTE, 20); //흐르게함
		ca.add(Calendar.MINUTE, 20); //roll과 다르게 다른 필드에 영향o
		System.out.println(ca.getTime());
		
		
		System.out.println("=========================");
		ca = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String time = sd.format(ca.getTime());
		System.out.println(time);
	}

}