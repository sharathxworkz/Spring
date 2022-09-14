package com.xworkz.dammy.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dammy.configure.ConfigureDoc;
import com.xworkz.dammy.src.DemonDolls;

public class DemonRunner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigureDoc.class);
		System.out.println(container);
		DemonDolls demonDolls = container.getBean(DemonDolls.class);
		System.out.println(demonDolls);

	}

}
