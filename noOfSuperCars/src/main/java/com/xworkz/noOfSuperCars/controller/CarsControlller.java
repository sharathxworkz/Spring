package com.xworkz.noOfSuperCars.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkxz.noOfSuperCars.dto.SuperCarDTO;

@Component
@RequestMapping("/")
public class CarsControlller {

	public CarsControlller() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/cars.do")
	public String onSend(SuperCarDTO car, Model model) {
	System.out.println("Calling OnSend Method");	
	System.out.println("Details Entered Are:"+car);
		return "index.jsp";
	
	}
}
