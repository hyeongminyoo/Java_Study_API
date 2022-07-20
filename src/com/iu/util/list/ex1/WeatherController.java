package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.FlowView;

public class WeatherController {
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1.날씨정보 초기화");
			System.out.println("2.전국 날씨 출력");
			System.out.println("3.지역 날씨 검색");
			System.out.println("4.지역 정보 추가");
			System.out.println("5.지역 정보 삭제");
			System.out.println("6.프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ws.init(ar);
				break;
			case 2:
				wv.view(ar);
				break;
			case 3:
				wv.view(ws.find(ar));
				break;
			case 4:
				ws.add(ar);
				break;
			case 5:
				ws.remove(ar);
				break;
			case 6:
				wv.view("프로그램 종료");
				check = !check;
				break;
				
			}
			
			
		}
		
		
	}
}
