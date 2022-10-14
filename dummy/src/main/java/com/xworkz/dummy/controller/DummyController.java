package com.xworkz.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.dummy.dto.DummyDTO;
import com.xworkz.dummy.service.DummyService;

@Controller
@RequestMapping("/dummy")

public class DummyController {

	@Autowired
	private DummyService dummyService;
	
	public DummyController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSave(DummyDTO dummy, Model  model) {
		System.out.println("Calling onSave Method");
		System.out.println("Details Entered Are:"+dummy);
		dummyService.validateAndSave(dummy);
		return "Display";
	}
}
