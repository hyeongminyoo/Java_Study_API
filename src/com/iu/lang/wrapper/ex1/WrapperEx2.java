package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호 입력
	// 9  7  1  1  2  4 -  1  2  3  4  5  6  7(체크용 번호)
	// *2 *3 *4 *5 *6 *7   *8 *9 *2 *3 *4 *5
	//18  21  4  5 18 28   8  18  6  12 20 30
	// 총합 : 
	// 총합 % 11 나머지
	// 나머지를 11에서 뺀 결과
	// 결과를 체크용 번호와 같은지 비교 
	// 같으면 맞는 번호 틀리면 아님
	
	//만약에 위의 연산결과가 두자리라면
	//연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	// ex) 11/10 나머지 1 을 다시체크용번호와 비교
	
	
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String jumin = sc.next();
//		String jumin = "951005-1057314";
		int total = this.juminCal(jumin);
		this.juminCheck2(total, jumin);
		
	}
	
	public int juminCal(String jumin) {
		
		jumin = jumin.replace("-", "");
		jumin = jumin.substring(0, 12);
//		System.out.println(jumin);
		
		int index = jumin.length();
		
	
		// 주민번호 문자열로부터 단일 문자열 배열 저장
		String [] juminEach = new String[index];
		for(int i =0; i<index; i++) {
			char ch = jumin.charAt(i);
			juminEach[i] = String.valueOf(ch);

		}
		
		
		//주민번호 문자열을 각각 인티저 타입으로 변환 후 int 배열 저장
		int [] juminEachNum = new int [index];
		
		for(int i = 0; i<index; i++) {
			juminEachNum[i] = Integer.parseInt(juminEach[i]);

		}
		
		
		//int 타입 배열과 계산식 저장
		int [] eachCal = new int[index];
		int j = 2;
		for(int i = 0; i<index; i++) {
			eachCal[i]= juminEachNum[i] * j;
			j++;
			if(j==10) {
				j=2;
			}
		}
		
		//j와 계산한 배열의 각 인덱스 총합 계산
		
		int total = 0;
		for(int i = 0; i<index; i++) {
			total = total + eachCal[i];
		}
		
		System.out.println("총합 : " + total);
		
		return total;
		
	}
	
	public void juminCheck2(int total, String jumin) {
		//total % 11 나머지 11에서 뺀 결과
		// 결과를 체크용 번호와 같은지 비교 
		int result = 11- total%11;
		int result2 = 0;
		String lastIndex= jumin.substring(13);
		int lastNum = Integer.parseInt(lastIndex);
		
		System.out.println("체크용 마지막 숫자 : " + lastNum);
		
		if(result == lastNum) {
			System.out.println("맞는번호입니다.");
		}else if(result != lastNum) {
			if(result >= 10 ) {
				result2 = total%10;
				if(result2 == lastNum) {
					System.out.println("맞는번호입니다.");
				}else {
					System.out.println("틀린번호입니다.");
				}
			}else {
				System.out.println("틀린번호입니다.");
			}
		}else {
			System.out.println("틀린번호입니다.");
		}
		
//		if(result2 == lastNum) {
//			System.out.println("맞는번호입니다.");
//		}
		
		
	}
	
	
	
}
