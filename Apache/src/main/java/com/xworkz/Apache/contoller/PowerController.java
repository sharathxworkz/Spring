package com.xworkz.Apache.contoller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PowerController {

	public PowerController() {
	
		System.out.println("Calling Default Constructor Of Class: "+this.getClass().getSimpleName());
	
	}
	
	@RequestMapping("/add.tr")
	public String onClick() {
		System.out.println("calling Onclick Function");
		return "invite.jsp";
	}
	
	@RequestMapping("/invite.tr")
	public String onSubmit() {
		System.out.println("Calling onSubmit Function");
		return "index.jsp";
	}
}
