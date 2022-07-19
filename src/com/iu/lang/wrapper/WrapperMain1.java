package com.iu.lang.wrapper;

import com.iu.lang.wrapper.ex1.WrapperEx1;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		
		Integer integer = new Integer(num); //생성자 deprecated 미래에는 삭제예정
		int n = integer.intValue();
		
		n = 50;
		integer = new Integer(n);
		
		integer = n; //auto-boxing
		n = integer;// auto-unboxing
		
		long l = 10L;
		Long ll = l; //auto-boxing
		
		integer = (int)l; //형변환 
//		integer = ll; //reference 타입이므로 강제형변환 x
		
		String num1 = "10"; 
		String num2 = "3.12";
		String num3 = "60";
		
		int n1 =Integer.parseInt(num1); //클래스명.메소드명 의 경우 static임을 추측가능
		double n2 =Double.parseDouble(num2);
		long n3 =Long.parseLong(num3);
		
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*2);
		System.out.println(num+2);
		
//		WrapperEx1 w1 = new WrapperEx1();
////		w1.infoCheck();
//		
//		w1.ex1();
		

	}

}
