package com.xworkz.dammy.src;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemonDolls {

	@Value("${origin}")
	private String origin;
	@Value("${color}")
	private String color;
	@Value("${type}")
	private String type;
	@Value("${val}")
	private Boolean dangerous;
	
	public DemonDolls() {
		
		System.out.println("Involed Default Constructor");
	}

	@Override
	public String toString() {
		return "DemonDolls [origin=" + origin + ", color=" + color + ", type=" + type + ", dangerous=" + dangerous
				+ "]";
	}
	
	
}
