package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할 파악
		//WeatherMain	   	: 프로그램 실행, Test 
		//WeatherService 	: Data 가공 
		//WeatherView 		: 정보 출력 전용
		//WeatherController : 관리
		//CityDTO			: Data
		
//		WeatherView wv = new WeatherView();
//		CityDTO cityDTO = new CityDTO();
//		cityDTO.setName("NY");
//		cityDTO.setGion(32.1);
//		cityDTO.setHum(20);
//		cityDTO.setStatus("눈");
//		
//		CityDTO cityDTO2 = new CityDTO();
//		cityDTO2.setName("LA");
//		cityDTO2.setGion(33.1);
//		cityDTO2.setHum(25);
//		cityDTO2.setStatus("맑음");
//		
//		ArrayList<CityDTO> ar = new ArrayList<>();
//		ar.add(cityDTO);
//		ar.add(cityDTO2);
//		
//		wv.view(ar);
		
		
		WeatherController wc = new WeatherController();
		wc.start();
	}

}
