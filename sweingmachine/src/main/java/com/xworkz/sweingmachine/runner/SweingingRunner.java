package com.xworkz.sweingmachine.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.sweingmachine.Tailormachine;

public class SweingingRunner {

	public static void main(String[] args) {
	
		ApplicationContext contianer =  new ClassPathXmlApplicationContext("annotationConfigure.xml");
		System.out.println(contianer);
		Tailormachine tailormachine = contianer.getBean(Tailormachine.class);
		System.out.println(tailormachine);

	}

}
