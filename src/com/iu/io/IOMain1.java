package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		// 키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in; //byte 처리 byte 단위로 조합
		InputStreamReader ir = new InputStreamReader(is); // 한글자 단위로 변경 
		BufferedReader br = new BufferedReader(ir); // 글자 단위를 모음 컴퓨터 내 버퍼에 입력
		System.out.println("키보드에서 입력 후 엔터");
		String msg="";
		try {
			msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);

		

	}

}
