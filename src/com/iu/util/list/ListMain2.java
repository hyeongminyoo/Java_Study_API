package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//
		ListView listView = new ListView();
		
		ArrayList<String> ar = new ArrayList<>(); //<> Generic 데이터타입의 안정성 보장
		ar.add("first");
//		ar.add(2); //Integer로 auto Boxing 됨 모든 데이터는 object type = > 다형성
//		ar.add('c'); //Character auto Boxing 다형성
//		ar.add(2.123); // Double auto Boxing 다형성
		ar.add(null); // 
		
		// get 	-> 특정 인덱스의 요소를 반환
		String n1 = ar.get(0);
//		int n2 = (Integer)ar.get(1); //auto unboxing
//		char n3 = (Character)ar.get(2); //auto unboxing
//		double n4 = (Double)ar.get(3);
		
		
//		listView.view(ar);
		
		System.out.println(ar.get(0) instanceof String); // 데이터타입 검사
		
		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);

	}

}
