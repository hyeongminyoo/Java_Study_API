package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {

	//private String info;
	private StringBuffer sb;
	
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
		
	}
	
	public WorkerDTO [] init() {
		//info 파싱해서 WorkerDTO에 대입
		//WorkerDTO를 모은 배열을 리턴
		String info = this.sb.toString();
		String newinfo = info.replace(", ", "-");
		StringTokenizer infos = new StringTokenizer(newinfo, "-");
		WorkerDTO [] workerDTOs = new WorkerDTO[infos.countTokens()/4];
		int i = 0;
		while(infos.hasMoreTokens()) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTOs[i] = workerDTO;
			workerDTO.setName(infos.nextToken());
			workerDTO.setDepartment(infos.nextToken());
			workerDTO.setJob(infos.nextToken());
			workerDTO.setPhone(infos.nextToken());
			i++;
		}
		
		return workerDTOs;
		
	
//		String [] infos = newinfo.split("-");
//		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
//		for(int i = 0; i<infos.length; i++) {
//			WorkerDTO workerDTO = new WorkerDTO();
//			workerDTOs[i/4] = workerDTO;
//			workerDTO.setName(infos[i].trim());
//			workerDTO.setDepartment(infos[++i].trim());
//			workerDTO.setJob(infos[++i].trim());
//			workerDTO.setPhone(infos[++i].trim());
//		}
		
//		return workerDTOs;
		
		
//		String [] total = info.split(", "); //사람 별로 구분 4명
//		WorkerDTO worker1 = new WorkerDTO();
//		WorkerDTO worker2 = new WorkerDTO();
//		WorkerDTO worker3 = new WorkerDTO();
//		WorkerDTO worker4 = new WorkerDTO();
//		WorkerDTO [] workers = {worker1,worker2,worker3,worker4};
//
//		String [] part1 = total[0].split("-");
//		String [] part2 = total[1].split("-");
//		String [] part3 = total[2].split("-"); 
//		String [] part4 = total[3].split("-");
//		
//		worker1.setName(part1[0]);
//		worker1.setDepartment(part1[1]);
//		worker1.setJob(part1[2]);
//		worker1.setPhone(part1[3]);
//		
//		worker2.setName(part2[0]);
//		worker2.setDepartment(part2[1]);
//		worker2.setJob(part2[2]);
//		worker2.setPhone(part2[3]);
//		
//		worker3.setName(part3[0]);
//		worker3.setDepartment(part3[1]);
//		worker3.setJob(part3[2]);
//		worker3.setPhone(part3[3]);
//		
//		worker4.setName(part4[0]);
//		worker4.setDepartment(part4[1]);
//		worker4.setJob(part4[2]);
//		worker4.setPhone(part4[3]);
//		
//		
//		return workers;
		
	}
	
	
	
}
