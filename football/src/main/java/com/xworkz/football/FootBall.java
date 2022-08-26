package com.xworkz.football;

public class FootBall {

	private String brandName;
	private Double price;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public FootBall() {
		
		System.out.println(this.getClass().getSimpleName()+ "Bean Created");
	}
	
	public FootBall(String name) {
		this.brandName = name;
		System.out.println(this.getClass().getSimpleName()+ " Bean Created");
	}
	
	public FootBall( String name,Double price) {
		this("Suhas");
		System.out.println("Hello");
		this.brandName = name;
		this.price = price;
		System.out.println(this.getClass().getSimpleName()+ " Bean Created");
	}
	
	@Override
	public String toString() {
		return "FootBall [brandName=" + brandName + ", price=" + price + "]";
	}

	
}
