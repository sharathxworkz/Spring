package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {

	public LandController() {
		System.out.println("Calling Default Constructor of LandController" + this.getClass().getSimpleName());
	}
	
	@RequestMapping("/create.do")
	public String onClick() {
		System.out.println("calling onClick Function");
		return "index.jsp";
	}
}
