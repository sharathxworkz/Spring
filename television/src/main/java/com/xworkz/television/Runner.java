package com.xworkz.television;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(container);
		Tv tv = container.getBean(Tv.class);
		System.out.println(tv);

	}

}
