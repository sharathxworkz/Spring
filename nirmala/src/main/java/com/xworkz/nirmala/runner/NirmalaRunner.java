package com.xworkz.nirmala.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.nirmala.configuration.NirmalaSpringConfiguration;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.entity.NirmalaEntity;
import com.xworkz.nirmala.service.NirmalaService;
import com.xworkz.nirmala.service.NirmalaServiceImpl;

import lombok.Getter;


public class NirmalaRunner {
	public static void main(String[] args) {
	
			NirmalaEntity dataEntity = getDataEntity();
	}

	private static NirmalaEntity getDataEntity() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NirmalaSpringConfiguration.class);
		System.out.println(context);
		NirmalaService bean = context.getBean(NirmalaServiceImpl.class);
		NirmalaEntity nirmal1 = new NirmalaEntity("Bangalore", "Male", "Public", 5.00D, LocalTime.of(2, 0), LocalDate.of(20, 11, 17), "Nandish", LocalDate.of(22, 7, 23), "Hanumath");
		NirmalaEntity nirmal2 = new NirmalaEntity("Bangalore", "Male", "Public", 5.00D, LocalTime.of(2, 0), LocalDate.of(20, 11, 17), "Nandish", LocalDate.of(22, 7, 23), "Hanumath");
		NirmalaEntity nirmal3 = new NirmalaEntity("Bangalore", "Male", "Public", 5.00D, LocalTime.of(2, 0), LocalDate.of(20, 11, 17), "Nandish", LocalDate.of(22, 7, 23), "Hanumath");
		NirmalaEntity nirmal4 = new NirmalaEntity("Bangalore", "Male", "Public", 5.00D, LocalTime.of(2, 0), LocalDate.of(20, 11, 17), "Nandish", LocalDate.of(22, 7, 23), "Hanumath");
		
		Boolean save = bean.save(nirmal1);
		Boolean save2 = bean.save(nirmal2);
		Boolean save3 = bean.save(nirmal3);
		Boolean save4 = bean.save(nirmal4);
		System.out.println(save+" "+save2+" "+save3+" "+save4);
		return nirmal4;
	}

}
