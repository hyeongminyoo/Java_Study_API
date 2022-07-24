package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//view 3개
	//1. String 출력
	//2. StudentDTO 출력
	//3. ArrayList<StudentDTO> 출력
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(StudentDTO studentDTO) {
		if(studentDTO == null) {
			System.out.println("찾는 학생이 없습니다.");
		}else {
			
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getNum());
			System.out.println(studentDTO.getKor());
			System.out.println(studentDTO.getEng());
			System.out.println(studentDTO.getMath());
			System.out.println(studentDTO.getTotal());
			System.out.println(studentDTO.getAvg());
		}
		
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0 ; i<ar.size(); i++) {
			this.view(ar.get(i));
			System.out.println("=========================");
		}
	}
	
	
	
	
}
