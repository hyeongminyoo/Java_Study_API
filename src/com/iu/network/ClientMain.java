package com.iu.network;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client Start");
		Client2 c2 = new Client2();
		try {
			c2.getFood();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Client Finish");

	}

}
