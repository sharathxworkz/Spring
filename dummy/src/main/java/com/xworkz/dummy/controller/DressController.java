package com.xworkz.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dummy.dto.ShirtDTO;
import com.xworkz.dummy.service.DressService;

@Controller
@RequestMapping("/shirt")
public class DressController {
	
	@Autowired
	private DressService dressService; 
	
	public DressController() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String save(ShirtDTO shirt) {
		System.out.println("Calling Save Method");
		Boolean save = dressService.validateAndSave(shirt);
		if(save) {
			System.out.println("Data Entered Are Valid");
			return "Display";
		}
		else {
			return "shirt";
		}
	}
	
	
	
	
	
}
