package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {

	//ex1 
	//주민번호 입력 : 앞 6 - 뒤 7 ex)971224-1234567
	//1. 남자, 여자 판단
	//2. 현재 나이 출력
	//3. 3-5 월 : 봄 출력
	//4. 6-8 월 : 여름
	//5. 9-11 월 : 가을
	//6. 12-2 월 : 겨울
	
	public void infoCheck() {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력");
		String idNum = sc.next();
		System.out.println(idNum);
		
		idNum = idNum.replace("-", "");
		
		String frontIdNum = idNum.substring(0,5);
		String backIdNum = idNum.substring(6);
		
		
		if(backIdNum.charAt(0)== '1' || backIdNum.charAt(0) == '3') {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
		
		String year = frontIdNum.substring(0, 2);
		
		
		if(frontIdNum.charAt(0)=='9') {
			sb.append("19");
			sb.append(year);
		}else {
			sb.append("20");
			sb.append(year);
		}
		year = sb.toString();
		
		
		int yearNum = Integer.parseInt(year);
		int age = 2022-yearNum + 1;
		
		
		System.out.println("나이 : " + age);
		
		String month = frontIdNum.substring(2, 4);
		int monthNum = Integer.parseInt(month);
		
		if(monthNum==3 || monthNum==4 || monthNum==5) {
			System.out.println("계절: 봄");
		}else if(monthNum==6||monthNum==7||monthNum==8) {
			System.out.println("계절:여름");
		}else if(monthNum==9||monthNum==10||monthNum==11) {
			System.out.println("계절:가을");
		}else {
			System.out.println("계절:겨울");
		}
		
		
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
//		String jumin = sc.next();
		String jumin = "971224-1234567";
		this.check1(jumin);
		this.age(jumin);
		this.season(jumin);
		
	}
	
	public void check1(String jumin) {
		//1.남자 여자 판단
		char ch = jumin.charAt(7);
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	public void age(String jumin) {
		String year = jumin.substring(0, 2);
		int yearNum =Integer.parseInt(year);
		char ch = jumin.charAt(7);
		int age = 0;
		if(ch == '1' || ch =='2') {
			yearNum = yearNum+1900;
		}else {
			yearNum = yearNum +2000;
		}
		
		age = 2022-yearNum+1;
		System.out.println(age);
		
	}
	
	public void season(String jumin) {
		//범위
		String month = jumin.substring(2,4);
		int monthNum = Integer.parseInt(month);
		String season = null;
		if(monthNum>=3 && monthNum<=5) {
			season = "봄";		
		}else if(monthNum>=6 && monthNum<=8) {
			season = "여름";
		}else if(monthNum>=9 && monthNum<=11) {
			season = "가을";
		}else {
			season = "겨울";
		}
		
		System.out.println(season);
		
		
	}
	
	
}
