package com.iu.io.file.ex1;

public class StudentMain {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		try {
			sc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
