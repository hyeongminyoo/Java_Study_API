package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력받음, abc.txt, jpg.word
		//파일이 이미지 파일인지 아닌지 구별
		// 이미지파일이면 이미지파일입니다
		// 아니면 아닙니다.
		// 확장자 jpg, png, gif, jpeg
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();
		int index = 0;
		for(int i = 0; i<fileName.length(); i++) {
			index = fileName.indexOf(".");
		}
		System.out.println(index);
		String exts = fileName.substring(index);
		System.out.println(exts);
		
		if(exts.equals(".jpg")||exts.equals(".png")||exts.equals(".gif")||exts.equals(".jpeg")) {
			System.out.println("이미지 파일입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}
		
		
	}
	
	
	public void studyIndexOfEx1() {
		String name = "iu,suji,choa,hani";
		boolean check = true;
		int index = 0; //쉼표의 찾은 인덱스 번호 저장 
		int count = 0; //쉼표의 개수를 담을 변수
		while(check) {
			index = name.indexOf(',', index);
			
			if(index == -1) {
				break;
			}else {
				count++;
				index++;
			}
		}//while 끝
		
		System.out.println("쉼표의 갯수 : "+count);
		System.out.println("인원 수 : " + count+1);
		
		
		
		//1.names에는 몇개의 쉼표가 있는가??
		//2.총 몇명이 있습니까?
//		int numbers = 0;
//		int first = name.indexOf(',', 0);
//		int second = name.indexOf(',', 0);
//		int third = name.indexOf(',', 0);
//		int fourth = name.indexOf(',', 0);
//		for(int i = 0; i<name.length(); i++) {
//			second = name.indexOf(',', i);
//			if(second != first) {
//				numbers++;
//				break;
//			}
//		}
//		for(int i = 0; i<name.length(); i++) {
//			third = name.indexOf(',', i);
//			if(third != second) {
//				numbers++;
//				break;
//			}
//		}
//		for(int i = 0; i<name.length(); i++) {
//			fourth = name.indexOf(',', i);
//			if(fourth != third) {
//				numbers++;
//				break;
//			}
//		}
//		System.out.println(numbers);
//		System.out.println(numbers+1);
		
		
	}
		
		
	

	public void studyIndexOf() {
		String str = "Hello Java";
		int index = str.indexOf("ll"); // ch = > char 형변환
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google에 입사 지원동기는 ... Google";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2 = " h i "; // 
		str2 = str2.trim(); //앞 뒤 공백만 제거
		str2 = str2.replace(" ", ""); // 중간 공백 대체
		System.out.println(str.equals(str2));
		
	}
	
	public void studySubString() {
		//하나의 문자열을 분리하는작업(parsing)
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0, 2); //endIndex 는 미만
		System.out.println(pw +" / "+ id);
		
		
	}
	
	
	
	
	
	
}
