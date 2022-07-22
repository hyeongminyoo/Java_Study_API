package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		StudentDAO studentDAO = new StudentDAO();
		ArrayList<StudentDTO> ar = new ArrayList<>();
		ar = studentDAO.getList();
		
		for(int i = 0; i<ar.size(); i++) {
			int kor = ar.get(i).getKor();
			int eng = ar.get(i).getEng();
			int math = ar.get(i).getMath();
			int total = kor + eng + math;
			double avg = total/3.0;
			ar.get(i).setTotal(total);
			ar.get(i).setAvg(avg);
		}
		
		return ar;
	}
	
	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		StudentDAO studentDAO = new StudentDAO();
		int result = studentDAO.setList(ar);
		return result;
	}
	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 번호를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0; i<ar.size(); i++) {
			if(ar.get(i).getNum() == num) {
				return ar.get(i);
			}
		}
		return null;
	}
	
	
	
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하려는 학생의 번호 입력");
		int num = sc.nextInt();
		
		for(int i = 0; i<ar.size() ; i++) {
			if(ar.get(i).getNum() == num) {
				ar.remove(i);
				return 1;
			}
		}
		
		return 0;
	}
	
	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가 학생의 이름 입력");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수 입력");
		studentDTO.setMath(sc.nextInt());
		
		ar.add(studentDTO);
	
	}
	
	
	
}
