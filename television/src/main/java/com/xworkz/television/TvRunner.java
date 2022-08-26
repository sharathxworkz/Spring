package com.xworkz.television;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(container);
		Tv tv = container.getBean(Tv.class);
		System.out.println(tv);
		
//		Display display = container.getBean(Display.class);
//		System.out.println(display.type);
//		System.out.println("****************************************************");
//		SetupBox setupBox = container.getBean(SetupBox.class);
//		System.out.println(setupBox.companyName);
//		System.out.println("****************************************************");
//		Remote remote = container.getBean(Remote.class);
//		System.out.println(remote);
//		System.out.println("****************************************************");
//		Stand stand = container.getBean(Stand.class);
//		System.out.println(stand.standMaterial);
	}

}
