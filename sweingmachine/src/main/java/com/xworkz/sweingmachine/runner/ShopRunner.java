package com.xworkz.sweingmachine.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xworkz.sweingmachine.tailor.TailorShopName;

public class ShopRunner {

	public static void main(String[] args) {
		
		ApplicationContext contianer =  new ClassPathXmlApplicationContext("aconfigure.xml");
		System.out.println(contianer);
		TailorShopName tailorShopName = contianer.getBean(TailorShopName.class);
		System.out.println(tailorShopName);
	}

}
