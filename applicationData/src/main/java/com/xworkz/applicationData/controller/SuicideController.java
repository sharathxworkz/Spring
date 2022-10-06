package com.xworkz.applicationData.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.applicationData.dto.CommitedSucideDTO;

@Component
@RequestMapping("/")
public class SuicideController {

	public SuicideController() {

		System.out.println("Calling Default Constructor Of:" + this.getClass().getSimpleName());
	}

	@RequestMapping("/create.do")
	public String onSend(CommitedSucideDTO csd, Model model) {
		System.out.println("Running onSend Method");
		System.out.println("Data Inserted are:"+csd);
		model.addAttribute("message", csd);
		return "CommitSucide.jsp";
	}
}
