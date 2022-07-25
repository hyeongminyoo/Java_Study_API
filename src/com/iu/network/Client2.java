package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	
	//getFood
	//서버랑 접속 후 
	//1. 점심 메뉴
	//2. 저녁 메뉴
	//3. 종료
	// 번호를 입력받아서 server로 전송
	// 받아서 무슨메뉴가 왔는지 출력 
	// 3번 누를때까지
	
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.27", 8282);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		while(check) {
			System.out.println("1.점심메뉴");
			System.out.println("2.저녁메뉴");
			System.out.println("3.프로그램종료");
			
			int select = sc.nextInt();
			
			//번호 전송
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(select+"\r\n");
			bw.flush();
			
			if(select == 3) {
				break;
			}
			
			//메뉴 받음
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			System.out.println(br.readLine());
			
		
		}//while문 끝
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		
	}
	
}
