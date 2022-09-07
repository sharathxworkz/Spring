package com.xworkz.television;

import org.springframework.stereotype.Component;

@Component
public class Remote {

	 String type;
	 Integer noOfBattery;
	
	 
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Integer getNoOfBattery() {
		return noOfBattery;
	}


	public void setNoOfBattery(Integer noOfBattery) {
		this.noOfBattery = noOfBattery;
	}


	public Remote() {
		System.out.println(this.getClass().getSimpleName()+"Bean Created");	
	}
	
	
	public Remote(String type, Integer noOfBattery) {
		this.type = type;
		this.noOfBattery = noOfBattery;
	}


	@Override
	public String toString() {
		return "Remote [type=" + type + ", noOfBattery=" + noOfBattery + "]";
	}
	
	
}
