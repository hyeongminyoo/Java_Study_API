package com.iu.io.file.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentService sc = new StudentService();
		StudentDAO sd = new StudentDAO();
		try {
//			ar = sd.getList();
			ar = sc.getList();
//			sd.setList(ar);
			for(int i=0; i<ar.size(); i++) {
				System.out.println(ar.get(i).getName());
				System.out.println(ar.get(i).getNum());
				System.out.println(ar.get(i).getKor());
				System.out.println(ar.get(i).getEng());
				System.out.println(ar.get(i).getMath());
				System.out.println(ar.get(i).getTotal());
				System.out.println(ar.get(i).getAvg());
				System.out.println("================================");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
