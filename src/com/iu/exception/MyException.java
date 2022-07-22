package com.iu.exception;

public class MyException extends Exception {
	
	public MyException() {
		super("몰라요 산수 포기");
		
	}
	
	public MyException(String message) {
		super(message); //부모의 생성자 호출 (생략되어있음)
	}
	
}
