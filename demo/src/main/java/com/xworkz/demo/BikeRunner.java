package com.xworkz.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeRunner {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(container);
		Bike bike = container.getBean(Bike.class);
		System.out.println(bike);
	}

}
