package com.xworkz.country.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.country.dto.PersonDTO;

@Component
@RequestMapping("/")
public class DisplayController {

	public DisplayController() {

		System.out.println("Calling default Constructor of:" + this.getClass().getSimpleName());
	}

	@RequestMapping("/display.do")
	public String display(PersonDTO person, Model model) {
		System.out.println("Calling display Method");
		System.out.println("Details entered Are:" + person);
		model.addAttribute("person", person);
		return "display.jsp";

	}

}
