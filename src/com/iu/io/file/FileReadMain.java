package com.iu.io.file;

import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		try {
			fw.write();
			fr.read();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
