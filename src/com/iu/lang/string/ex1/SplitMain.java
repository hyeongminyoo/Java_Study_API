package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		WorkerDTO [] workers = ws.init();
		wv.workerView(workers);
//		int num = 10;
		
		//valueOf :문자열로 변경
//		String str = String.valueOf(num);
//		System.out.println(str);
	}

}
