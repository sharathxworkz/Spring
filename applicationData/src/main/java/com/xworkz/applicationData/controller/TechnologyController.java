package com.xworkz.applicationData.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TechnologyController {

	public TechnologyController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/save.do")
	public String onClick(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("aName");
		String company = request.getParameter("company");
		String yearOfStart = request.getParameter("year");
		String currentVersion = request.getParameter("version");
		String noOfEmployees = request.getParameter("capacity");
		String technology = request.getParameter("tech");
		System.out.println("Calling onClick Method");
		System.out.println("Details Entered Are:" + name+" "+company+" "+yearOfStart+" "+currentVersion+" "+noOfEmployees+" "+technology);
		
		request.setAttribute("Name", name);
		request.setAttribute("Company", company);
		request.setAttribute("YearOfStart",yearOfStart);
		request.setAttribute("Version", currentVersion);
		request.setAttribute("Size", noOfEmployees);
		request.setAttribute("Technology", technology);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index.jsp";
		
	}
	
	@RequestMapping("/display.do")
	public String displayAll(Model model) {
		
		Object Name = model.getAttribute("aName");
		Object Company = model.getAttribute("company");
		Object Year = model.getAttribute("year");
		Object Version = model.getAttribute("version");
		Object NoOfEmployees = model.getAttribute("capacity");
		Object TechnologyUsed = model.getAttribute("tech");
		System.out.println("Calling displayAll Method");
		System.out.println("Details Entered Are:" + Name+" "+Company+" "+Year+" "+Version+" "+NoOfEmployees+" "+TechnologyUsed);
		return "DisplayAll.jsp";
	}
}
