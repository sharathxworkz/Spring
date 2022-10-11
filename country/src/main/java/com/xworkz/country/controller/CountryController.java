package com.xworkz.country.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class CountryController {

	Collection<String> city = new ArrayList<String>();
	
	public CountryController() {
		
		System.out.println("Calling default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/land.do")
	public String onSave(Model model) {
		city.add("Banglore");
		city.add("Mysore");
		city.add("ChickaManglore");
		city.add("Madikeri");
		city.add("Hassan");
		city.add("Hampi");
		
		model.addAttribute("cities", city);
		return "index.jsp";
		
		
	}
	
	
}
