package com.xworkz.company.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.company.dto.CompanyDTO;

@WebServlet(loadOnStartup = 7,urlPatterns = {"/comp","/showDetails"})
public class CompanyServlet extends HttpServlet {

	List<CompanyDTO> companies = new ArrayList<CompanyDTO>();
	
	public CompanyServlet() {
	System.out.println("Call To Default Constructor For Creating CompanyServlet Instance");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Using Post Method To Get Data");
		resp.setContentType("text/html");
		String name = req.getParameter("cName");
		String founder = req.getParameter("founder");
		String dateOfStart = req.getParameter("date");
		String employees = req.getParameter("emp");
		String location = req.getParameter("location");
		String bussiness = req.getParameter("busn");
		
		System.out.println("Name of The Company Is:" +name);
		System.out.println("Founder Of The Company Is:"+founder);
		System.out.println("The Company was Started ON:"+dateOfStart);
		System.out.println("The Number Of Employees in The Company are:"+employees);
		System.out.println("The Company is Located at:"+location);
		System.out.println("The Company Bussiness Type is:"+bussiness);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h3>")
		.append("Company Name is:  ").append(name)
		.append("<br>")
		.append("Company Founder is: ").append(founder)
		.append("<br>")
		.append("Company Started ON:  ").append(dateOfStart)
		.append("<br>")
		.append("Employees in The Company:  ").append(employees)
		.append("<br>")
		.append("Company Located at:  ").append(location)
		.append("<br>")
		.append("Company Bussiness Type:  ").append(bussiness)
		.append("</h3>")
		.append("</html>")
		.append("</body>");
		
		CompanyDTO company = new CompanyDTO(name, founder, dateOfStart, employees, location, bussiness);
		boolean save = companies.add(company);
		System.out.println(save);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling doGet Method");
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html>")
		.append("<head>")
		.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">")
		.append("<body>")
		.append("<h3>")
		.append("Display All The Details Entered By Endusers")
		.append("</h3>")
		.append("<Table class=table>");
		for (CompanyDTO companyDTO : companies) {
		writer.append("<thead>")
		.append("<tr>")
		.append("<th>")
		.append("Company Name")
		.append("</th>")
		.append("<th>")
		.append("Company Founder")
		.append("</th>")
		.append("<th>")
		.append("Company Started Date")
		.append("</th>")
		.append("<th>")
		.append("No Of Employees In Company")
		.append("</th>")
		.append("<th>")
		.append("Company Location")
		.append("</th>")
		.append("<th>")
		.append("Company Functionality Type")
		.append("</th>")
		.append("</tr>")
		.append("</thead>")
		.append("<tbody>")
		.append("<tr>")
		.append("<td>")
		.append(companyDTO.getCompanyName())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getCompanyFounder())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getCreatedAt())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getNoOfEmployees())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getLocation())
		.append("</td>")
		.append("<td>")
		.append(companyDTO.getCompanyType())
		.append("</td>")
		.append("</tr>")
		.append("</tbody>");
		}
		writer.append("</Table>")
		.append("</head>")
		.append("</body>")
		.append("</html>");	
	}
}
