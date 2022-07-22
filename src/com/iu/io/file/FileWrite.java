package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public void write() throws Exception {
		File file = new File("C:\\study", "test.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("Today is Friday\r\n");
//		fw.flush(); //버퍼에있는것을 강제로 마지막으로 밈
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
	}
}
