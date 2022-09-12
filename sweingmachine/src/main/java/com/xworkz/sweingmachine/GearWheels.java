package com.xworkz.sweingmachine;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GearWheels {
	

	private Integer noOfWheels;
	
	public GearWheels() {
		System.out.println("GearWheels Bean created" + this.getClass().getSimpleName());
	}

	
	public Integer getNoOfWheels() {
		return noOfWheels;
	}

	@Value("${noOfWheels}")
	public void setNoOfWheels(Integer noOfWheels) {
		this.noOfWheels = noOfWheels;
	}


	@Override
	public String toString() {
		return "GearWheels [noOfWheels=" + noOfWheels + "]";
	}


	
	
	

}