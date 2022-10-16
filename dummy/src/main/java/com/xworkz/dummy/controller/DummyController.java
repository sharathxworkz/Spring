package com.xworkz.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.dummy.dto.DummyDTO;
import com.xworkz.dummy.service.DummyService;
import com.xworkz.dummy.service.impl.DummyServiceImpl;

@Controller
@RequestMapping("/dummy")
public class DummyController {

	@Autowired
	private DummyService dummyService;
	
	public DummyController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSave(DummyDTO dummy) {
		System.out.println("Calling onSave Method");
		System.out.println("Details Entered Are:"+dummy);
		
		Boolean save = dummyService.validateAndSave(dummy);
		if(save) {
			System.out.println("The values are Sent to service:"+save);
			return "Display";
		}
		else {
			System.out.println("Details Are Incorrect");
		}
		return "index";
	}
}
