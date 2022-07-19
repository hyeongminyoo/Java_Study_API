package com.iu.lang.string.ex1;

public class WorkerView {
	
	//view
	//WorkerDTO들을 받아서 정보를 출력
	
	public void workerView(WorkerDTO [] workerDTOs) {
		for(WorkerDTO workerDTO : workerDTOs) {
			
			System.out.println(workerDTO.getName());
			System.out.println(workerDTO.getDepartment());
			System.out.println(workerDTO.getJob());
			System.out.println(workerDTO.getPhone());
			System.out.println("=================");
		}
	}
	
}
