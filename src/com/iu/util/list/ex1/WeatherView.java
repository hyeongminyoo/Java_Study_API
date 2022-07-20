package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherView {
	
	Scanner sc = new Scanner(System.in);
	
	public void view(ArrayList<CityDTO> ar) {
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getGion());
			System.out.println(ar.get(i).getHum());
			System.out.println(ar.get(i).getStatus());
		}
		
	}
	
	public void view(CityDTO ctd) {
		
		System.out.println(ctd.getName());
		System.out.println(ctd.getGion());
		System.out.println(ctd.getHum());
		System.out.println(ctd.getStatus());
	
	}
	
	public void view(String str) {
		System.out.println(str);
	}
	
	
}
