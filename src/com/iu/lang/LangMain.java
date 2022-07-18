package com.iu.lang;

public class LangMain {

	public static void main(String[] args) {
		Object obj = new Object();
		String str = obj.toString();
		Member member = new Member();
		System.out.println(str);
		String str2 = member.toString();
		System.out.println(str2);
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		
		//다형성 모든클래스는 Object 타입에 속한다
		obj = member;
		
		boolean check = car.equals(obj); // car == car2
		System.out.println(car);
		System.out.println(car.toString());
		System.out.println(check);
		
		String name = "iu";
		System.out.println(name);
		
	}

}
