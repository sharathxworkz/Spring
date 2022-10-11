package com.xworkz.country.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Component
@RequestMapping("/")
public class CountryController {

	Collection<String> city = new ArrayList<String>();
	
	public CountryController() {
		
		System.out.println("Calling default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/land.do")
	public ModelAndView onSave() {
		city.add("Banglore");
		city.add("Mysore");
		city.add("ChickaManglore");
		city.add("Madikeri");
		city.add("Hassan");
		city.add("Hampi");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cities", city);
		mv.setViewName("index.jsp");
		mv.addObject("cities", city);
		return mv;
		
	}
	
	
}
