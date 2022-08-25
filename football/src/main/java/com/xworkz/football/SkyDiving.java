package com.xworkz.football;

public class SkyDiving {
	
	private String location;
	private Double height;
	private Double price;
	
	


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public SkyDiving() {
		
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}
	
public SkyDiving(String location ,Double height ,Double price) {
		this.location = location;
		this.height = height;
		this.price = price;
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}

	@Override
	public String toString() {
		return "SkyDiving [height=" + height + ", price=" + price + "]";
	}
	
	

}
