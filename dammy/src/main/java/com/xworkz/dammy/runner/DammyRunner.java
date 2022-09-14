package com.xworkz.dammy.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dammy.src.DammyDolls;

public class DammyRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(container);
		DammyDolls dolls = container.getBean(DammyDolls.class);
		System.out.println(dolls);
	}

}
