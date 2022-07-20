package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	Scanner sc = new Scanner(System.in);
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5-85,태풍");
	}
	
	public void init(ArrayList<CityDTO> ar) {
		String info = this.sb.toString();
		info = info.replace(",", "-");
//		System.out.println(info);
		StringTokenizer st = new StringTokenizer(info, "-");
		
		while(st.hasMoreTokens()) {
			CityDTO cd = new CityDTO();
			cd.setName(st.nextToken());
			cd.setGion(Double.parseDouble(st.nextToken()));
			cd.setHum(Integer.parseInt(st.nextToken()));
			cd.setStatus(st.nextToken());
			ar.add(cd);
		}
		
		System.out.println("초기화 완료");
	}
	
	public void add(ArrayList<CityDTO> ar) {
		CityDTO cd = new CityDTO();
		System.out.println("도시 명을 입력하세요");
		cd.setName(sc.next());
		System.out.println("기온 정보 입력하세요");
		cd.setGion(sc.nextDouble());
		System.out.println("습도 입력");
		cd.setHum(sc.nextInt());
		System.out.println("상태 입력");
		cd.setStatus(sc.next());
		
		ar.add(cd);
		
	}
	
	public void remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제할 도시명 입력");
		String cityName = sc.next();
		cityName = cityName.toUpperCase();
		
		for(int i = 0 ; i<ar.size(); i++) {
			String str = ar.get(i).getName().toUpperCase();
			if(str.equals(cityName)) {
				ar.remove(i);
				System.out.println("삭제 완료");
				break;
			}
		}
		
	}
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		System.out.println("검색할 도시명 입력");
		String cityName = sc.next();
		cityName = cityName.toUpperCase();
		
		for(int i = 0; i<ar.size(); i++) {
			String str = ar.get(i).getName().toUpperCase();
			if(str.equals(cityName)) {
				return ar.get(i);
			}
		}
		
		return null;
		
	}
	
	
	
}
