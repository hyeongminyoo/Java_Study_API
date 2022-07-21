package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random 6개 숫자 1-45
		//중복되지 않은 데이터 6개를 뽑아 set에 담음
		Random rd = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(hashSet.size() != 6) { //hashSet.size() < 6
			hashSet.add(rd.nextInt(45)+1);
			}
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(hashSet); //참조변수의 주소가 아닌 데이터들이 출력됨 (오버라이딩 한것) 
	}

}
