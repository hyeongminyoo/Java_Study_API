package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "age";
//		str1 = str1 + str2;
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		
		String result = sb.toString(); //sb는 Stringbuffer타입이므로 toString() 객체를설명해주는 문자열 리턴 메서드 호출
		System.out.println(sb);
		System.out.println(result);
		
	}

}
