package com.xworkz.sweingmachine.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FashionRunner {

	public static void main(String[] args) {
		
		ApplicationContext contianer =  new ClassPathXmlApplicationContext("aconfigure.xml");
		System.out.println(contianer);
		


	}

}
