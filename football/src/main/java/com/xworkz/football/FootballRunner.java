package com.xworkz.football;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballRunner {

	public static void main(String[] args) {
		
		ApplicationContext contianer =  new ClassPathXmlApplicationContext("configure.xml");
		 System.out.println(contianer);
		 FootBall football = contianer.getBean(FootBall.class);
		 System.out.println("BrandName Of FootBall is:" +football.getBrandName());
		 Basketball basketball= contianer.getBean(Basketball.class);	
		 System.out.println("BrandName Of BasketBall is:"+basketball.getBrandName());
		 System.out.println("BasketBall AirFilled status  is:" +basketball.getAirFilled());
		 SkyDiving skyDiving = contianer.getBean(SkyDiving.class);
		 System.out.println("SkyDiving Location is:"+skyDiving.getLocation());
		 System.out.println("Height of SkyDiving is:" +skyDiving.getHeight());
		 System.out.println("Price Of SkyDiving is:" +skyDiving.getPrice());
		 String string = contianer.getBean(String.class);
		 System.out.println(string);
		 Integer integer = contianer.getBean(Integer.class);
 	  	 System.out.println(integer);
		 Double dob  = contianer.getBean(Double.class);
		 System.out.println(dob);
		 Float flo = contianer.getBean(Float.class);
		 System.out.println(flo);
		 Character cha = contianer.getBean(Character.class);
		 System.out.println(cha);
		 Boolean bool = contianer.getBean(Boolean.class);
		 System.out.println(bool);	
	}

}
