package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);  //생성자 표준입력기 : 키보드 : System.in
//		//Distribute DOS : 서비스를 거부하는 공격
//		//Denial Of Service
//
//		sc.close(); //서비스 연결해제 , 
		
		InputStream is = System.in; //0,1 키보드 연결
		InputStreamReader ir = new InputStreamReader(is); //글자 연결
		BufferedReader br = new BufferedReader(ir); //
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//연결된 역순으로 자원을 해제
			try{
				br.close();
				ir.close();
				is.close();
			}catch(Exception e) {
				
			}
		}
		
	}

}