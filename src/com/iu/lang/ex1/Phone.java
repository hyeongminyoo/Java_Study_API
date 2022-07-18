package com.iu.lang.ex1;

public class Phone {
	private int price;
	private int size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		Phone phone = (Phone)obj;
		
		boolean check = false;
		if(this.getPrice() == phone.getPrice() && this.getSize() == phone.getSize() ) {
			//check = true;
			check = !check;
		}
		return check;
	}
	
}
