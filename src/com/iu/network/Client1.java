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

public class Client1 {
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.27", 8282);
		System.out.println("Server 접속 완료");
		
		//--------------------------------------------------------------------
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		while(check) {
			System.out.println("메시지 입력");
		
			String message = sc.next();
			
			os = socket.getOutputStream(); //0,1을 처리
			ow = new OutputStreamWriter(os); //문자 한글자 처리
			bw = new BufferedWriter(ow); //문자열 버퍼에 저장
			
			//전송
			bw.write(message+"\r\n");
			bw.flush();
			
			if(message.toUpperCase().equals("Q") ) {
				//자원 해제 연결된 역순으로 해제 
				break;
			}
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br= new BufferedReader(ir);
			
			message = br.readLine();
			if(message.toUpperCase().equals("Q")) {
				//자원 해제 연결된 역순으로 해제 
				break;
			}
			System.out.println("Server : " + message);
			
			
		
		}
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		
	}

}
