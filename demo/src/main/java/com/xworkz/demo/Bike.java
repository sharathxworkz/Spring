package com.xworkz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Value("${companyName}")
	private String companyName;
	@Value("${bikeName}")
	private String BikeName;
	@Value("{color}")
	private String color;
	@Autowired
	private SuperBike sBike;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBikeName() {
		return BikeName;
	}

	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public SuperBike getsBike() {
		return sBike;
	}

	public void setsBike(SuperBike sBike) {
		this.sBike = sBike;
	}

	@Override
	public String toString() {
		return "Bike [companyName=" + companyName + ", BikeName=" + BikeName + ", color=" + color + ", sBike=" + sBike
				+ "]";
	}
	
	
}
