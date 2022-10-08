package com.xworkz.musicAndFood.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
	
}
