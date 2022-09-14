package com.xworkz.dammy.src;

public class DammyDolls {

	//Dammy By XMl
	private String dollName;
	private Integer price;
	private String origin;
	
	public DammyDolls() {
		
		System.out.println("Invoked Dammy Constructor");
	}
	
	public DammyDolls(String dollName, Integer price, String origin) {
		this.dollName = dollName;
		this.price = price;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return "DammyDolls [dollName=" + dollName + ", price=" + price + ", origin=" + origin + "]";
	}

	
	
}
