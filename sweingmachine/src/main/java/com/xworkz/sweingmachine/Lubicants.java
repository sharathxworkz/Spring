package com.xworkz.sweingmachine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lubicants {

	
	private String type;
	

	public Lubicants() {
		System.out.println("Lubicants Bean created" + this.getClass().getSimpleName());
	}

	

	public String getType() {
		return type;
	}


	@Value("Oil")
	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "Lubicants [type=" + type + "]";
	}
	
	

	
	
}
