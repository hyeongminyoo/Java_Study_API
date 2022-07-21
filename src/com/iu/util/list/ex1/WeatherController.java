package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.FlowView;

public class WeatherController {
	
	private WeatherService ws;
	private Scanner sc;
	private WeatherView wv;
	
	public WeatherController() {
		this.ws = new WeatherService(); //객체의 주소를 받아옴
		this.sc = new Scanner(System.in);
		this.wv = new WeatherView();
	}
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
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
				CityDTO cityDTO = ws.find(ar);
				if(cityDTO != null) {
					wv.view(cityDTO);
				}else {
					wv.view("없는 도시명");
				}
				break;
			case 4:
				boolean result = ws.add(ar);
				String message = "추가 실패";
				if(result) {
					message = "추가 성공";
				}
				wv.view(message);
				break;
			case 5:
				boolean result1 = ws.remove(ar);
				String message1 = "삭제 실패";
				if(result1) {
					message1 = "삭제 성공";
				}
				wv.view(message1);
				break;
			case 6:
				wv.view("프로그램 종료");
				check = !check;
				break;
			default :
				wv.view("프로그램 종료");
				check = !check;
				break;
				
			}
			
			
		}
		
		
	}
}
