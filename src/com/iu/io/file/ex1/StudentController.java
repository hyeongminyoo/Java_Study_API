package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	//start 메서드
	//1.학생정보출력 - 모든학생 정보 출력
	//2.학생정보검색 - getStudent
	//3.학생정보추가 - 학생정보 리스트에 추가 setStudentAdd
	//4.학생정보삭제 - 리스트에서 학생 정보 제거 
	//5.백     업 - 현재 리스트의 정보를 파일에 저장
	//6.종     료 
	
	public void start() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		
		ar = ss.getList();
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보출력");
			System.out.println("2.학생정보검색");
			System.out.println("3.학생정보추가");
			System.out.println("4.학생정보삭제");
			System.out.println("5.백      업");
			System.out.println("6.종      료");
			
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					sv.view(ar);
					break;
				
				case 2:
					StudentDTO studentDTO = ss.getStudent(ar);
					sv.view(studentDTO);
					break;
				
				case 3:
					ss.setStudentAdd(ar);
					break;
				case 4:
					int num = ss.setStudentDelete(ar);
					if(num==1) {
						sv.view("삭제성공");
					}else {
						sv.view("삭제 실패");
					}
					break;
				case 5:
					int result = ss.setList(ar);
					if(result == 1) {
						sv.view("백업 성공");
					}else {
						sv.view("백업 실패");
					}
					break;
				case 6:
					sv.view("프로그램 종료");
					check = !check;
					break;
				}
			}
			
		}
	
}
