package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2re {
	
	public void jumincheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호입력");
		String jumin = "971224-1234567";
		int count = 2;
		int sum = 0;
		for(int i = 0 ; i<jumin.length()-1; i++) {
		
		//1.substring() : String
//		String num = jumin.substring(i,i+1); // 1,2 2,3 3,4 .....
//		int n = Integer.parseInt(num);
		//2.CharAt() : char
//		char ch = jumin.charAt(0); //1,2,3 .....
		//ch 를 문자열로 변환
//		String num = String.valueOf(ch);
//		int n = Integer.parseInt(num);
		if(i==6) {
			continue;
		}
		
		int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
		sum = sum + n*count;
		count++;
		}
		
		int check = sum%11;
		check = 11 - check;
		
		if(check>9) {
			check=check%10;
		}
		
		int checkNum = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if(check == checkNum) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		
	}
}
