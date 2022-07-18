package com.iu.lang.ex1;

public class EqualMain {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setPrice(100);
		p1.setSize(50);
		
		Phone p2 = new Phone();
		p2.setPrice(100);
		p2.setSize(50);
		
		//주소를 비교하는것
		System.out.println(p1 == p2);
		
		// equals 메서드 오버라이딩
		// 각 멤버 값이 같으면 true, 하나라도 틀리면 false 리턴
		System.out.println(p1.equals(p2));
		
		System.out.println(p2.equals(p1));

	}

}
