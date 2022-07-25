package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {
	
	private ArrayList<String> lunch;
	
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("자장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안먹어");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");
		
	}
	
	
	//getFood
	//Server에서 메세지를 기다림
	//1 : 점심 메뉴 중 랜덤하게 하나를 골라서 client 전송
	//2 : 저녁 메뉴 중 랜덤하게 하나를 골라서 client 전송
	//3 : 프로그램 종료
	//4 : 잘못 입력된 번호입니다를 client로 전송
	
	
	public void getFood() throws Exception {
		//서버오픈
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(Calendar.getInstance().getTimeInMillis());
		ServerSocket serverSocket = new ServerSocket(8282);
		
		Socket socket = serverSocket.accept();
		
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		boolean check = true;
		while(check) {
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			 
			String select = br.readLine();
			
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			String message = null;
			
			switch(select) {
			case "1":
				message = this.lunch.get(rd.nextInt(lunch.size()));
				break;
			
			case "2":
				message = this.lunch.get(rd.nextInt(lunch.size()));
				break;
			case "3":
				message = "프로그램 종료";
				check = !check;
				break;
			default:
				message = "잘못된 번호 입력";
				break;
			}

			bw.write(message+"\r\n");
			bw.flush();
		
		}//while 문 끝
		
		br.close();
		ir.close();
		is.close();
		os.close();
		ow.close();
		bw.close();
		socket.close();
		serverSocket.close();
	
	
	
	}//메소드 끝
	
	

}
