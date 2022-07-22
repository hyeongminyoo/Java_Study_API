package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.iu.io.file.FileRead;

public class StudentDAO {
	//DAO : Data Access Object
	// file data에 접근
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//List로부터 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생했을 경우
		
		File file = new File("C:\\study\\StudentData.txt");
		try {
			FileWriter fw = new FileWriter(file, false);
			boolean check = true;
			
			fw.write("\r\n");
			for(int i = 0; i<ar.size(); i++) {
				fw.write(ar.get(i).getName()+",");
				fw.write(ar.get(i).getNum()+",");
				fw.write(ar.get(i).getKor()+",");
				fw.write(ar.get(i).getEng()+",");
				fw.write(ar.get(i).getMath()+"\r\n");
				fw.flush();
			}
			return 1;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}
	
	
	//1. getList : 
	//   studentData 파일의 내용을 읽어서 작업
	//	 ArrayList로 리턴

	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("C:\\study\\StudentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		boolean check = true;
		while(check) {
			String info = br.readLine();
			if(info==null) {
				break;
			}
			if(info=="") {
				info = br.readLine();
			}

			StringTokenizer st = new StringTokenizer(info, ",");
			while(st.hasMoreTokens()) {
				StudentDTO sdt = new StudentDTO();
				sdt.setName(st.nextToken());
				sdt.setNum(Integer.parseInt(st.nextToken().trim()));
				sdt.setKor(Integer.parseInt(st.nextToken().trim()));
				sdt.setEng(Integer.parseInt(st.nextToken().trim()));
				sdt.setMath(Integer.parseInt(st.nextToken().trim()));
				ar.add(sdt);
			}
		}
		
		return ar;

	}
	
}
