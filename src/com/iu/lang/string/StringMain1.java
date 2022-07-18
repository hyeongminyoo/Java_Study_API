package com.iu.lang.string;

public class StringMain1 {

	public static void main(String[] args) {
		
//		String str1 = "iu"; //"iu" 는 변수에 대입하는 상수 리터럴 // 메소드 내 상수영역에 "iu" 데이터 생성
//		String str2 = "iu"; // 메소드 내 상수영역에 "iu" 데이터 생성 , 상수영역내에 "iu" 데이터가 있으므로 str1 의 주소를 공유함(동일)
//		String str3 = new String("iu"); //힙 영역에 주소를 담을 수있는 데이터 생성
//		
//		System.out.println(str1 == str2);
//		//toString() 자동호출
//		System.out.println(str1 == str2); //true
//		System.out.println(str2 == str3); //false
//		System.out.println(str3);
//		
//		System.out.println("==================================");
//		System.out.println(str1.equals(str2)); //주소 비교가 아닌 내용 비교, object 클래스의 equals(주소비교)에서 오버라이딩한것
//		System.out.println(str1.equals(str3)); //주소 비교가 아닌 내용 비교이므로 true
		
//		StringStudy ss = new StringStudy();
//		ss.studyCharAt();
		
		StringStudy2 ss2 = new StringStudy2();
//		ss2.studyIndexOf();
//		ss2.studyIndexOfEx1();
//		ss2.studySubString();
		ss2.ex2();
	}

}
