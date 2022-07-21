package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherController wc = new WeatherController();
		wc.start();
		
		ArrayList<String> ar1 = new ArrayList<>();
		//배열을 제외한 컬렉션 타입은 reference 타입만 담을수 있다.
		ArrayList<String> ar2;
		//generic 타입이 다르면 다른 데이터타입
		
		ArrayList<ArrayList<String>> ars = new ArrayList<>();
		ArrayList<ArrayList<String>> ars2 = new ArrayList<>();

		ArrayList<ArrayList<ArrayList<String>>> arsAll = new ArrayList<>();
		
		
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
		
		
	}

}
