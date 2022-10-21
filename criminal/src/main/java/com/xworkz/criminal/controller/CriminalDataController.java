package com.xworkz.criminal.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalDataController{

	@Autowired
	private CriminalService criminalService;
	
	public CriminalDataController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSend(CriminalDTO criminal,Model model,@RequestParam("image") MultipartFile file) throws IOException {
		System.out.println("Calling onSend Method");
		byte[] bytes = file.getBytes();
        Path path = Paths.get("D:/temp-files/" + file.getOriginalFilename());
        Files.write(path, bytes);
		Boolean save = criminalService.validateAndSave(criminal);
		if(save) {
			System.out.println("Data Entered Are Vallid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Criminal Detail");
			return "index";
		}
		else {
			System.out.println("Data Entered Are not Valid");
		return "index";
		}
	}
	
	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling readAll Method");
		List<CriminalDTO> crimeDTO = criminalService.findAll();
		if(crimeDTO != null & !crimeDTO.isEmpty()) {
			System.out.println("The records Are Found"+crimeDTO.size());
			model.addAttribute("CriminalDetails", crimeDTO);
			model.addAttribute("RecordCount","No Of Records Found"+crimeDTO.size());
		}
		else {
			System.out.println("No Records Are Found");
		}
		return "CriminalData";
		
	}
	
	@GetMapping("/findByName")
	public String findByName(HttpServletRequest request, Model model) {
		String name = request.getParameter("criminalName");
		List<CriminalDTO> crimeDTO = criminalService.findByName(name);
		if(crimeDTO != null & !crimeDTO.isEmpty()) {
			System.out.println("The records Are Found"+crimeDTO.size());
			model.addAttribute("CriminalDetails", crimeDTO);
			model.addAttribute("RecordCount","No Of Records Found"+crimeDTO.size());
		}
		else {
			System.out.println("No Records Are Found");
		}
		
		
		return "CriminalData";
	}
	
	@GetMapping("/findByMany")
	public String findBYMany(HttpServletRequest request,Model model) {
		System.out.println("Calling findBYMany Method");
		String age = request.getParameter("criminalAge");
		String country = request.getParameter("country");
		String gender = request.getParameter("gender");
		List<CriminalDTO> criminalDTO = criminalService.findByAgeCountryGender(age, country, gender);
		if(criminalDTO !=null & !criminalDTO.isEmpty()) {
			System.out.println("No Of Records Found"+criminalDTO.size());
			model.addAttribute("CriminalDetails", criminalDTO);
			model.addAttribute("Records", "Records in DB"+criminalDTO.size());
		}
		else {
			
			System.out.println("No records Are Found In DB");
		}
			
		return "CriminalData";
		
	}
	
}
