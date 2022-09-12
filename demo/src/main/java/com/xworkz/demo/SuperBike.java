package com.xworkz.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SuperBike {

	@Value("${name}")
	private String companyName;
	@Value("${bName}")
	private String bName;
	@Value("${horsePower}")
	private Double horsePower;
	@Value("${torque}")
	private Double torque;
	@Value("${price}")
	private Double price;
	
	public SuperBike() {
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Double getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Double horsePower) {
		this.horsePower = horsePower;
	}

	public Double getTorque() {
		return torque;
	}

	public void setTorque(Double torque) {
		this.torque = torque;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SuperBike [companyName=" + companyName + ", bName=" + bName + ", horsePower=" + horsePower + ", torque="
				+ torque + ", price=" + price + "]";
	}


	
	
	
}
