package com.xworkz.job.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobApplicationDTO;

@WebServlet(loadOnStartup = 7,urlPatterns = "/job")
public class JobServlet extends HttpServlet {
	List<JobApplicationDTO> dto=new ArrayList<JobApplicationDTO>();

	public JobServlet() {
	
		System.out.println("Calling Default Constructor for creating JobServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling Service Method for");
		resp.setContentType("text/html");
		String name = req.getParameter("aName");
		String email = req.getParameter("email");
		String num = req.getParameter("phNumber");
		String Anum = req.getParameter("AphNumber");
		String gender = req.getParameter("gender");
		String education = req.getParameter("edu");
		String yop = req.getParameter("year");
		String Eboard = req.getParameter("board");
		String address = req.getParameter("location");
		String Java = req.getParameter("java");
		String Php = req.getParameter("php");
		String Python = req.getParameter("python");
		String cPlus = req.getParameter("c++");
		String Js = req.getParameter("js");
		String Json = req.getParameter("json");
		String Wp = req.getParameter("wp");
		String Magnito = req.getParameter("mag");
		String Ruby = req.getParameter("ruby");
		String Perl = req.getParameter("perl");
		String whiteSpace = req.getParameter("ws");
		String Linux = req.getParameter("linux");
		String Kali = req.getParameter("kali");
		String Jsp = req.getParameter("jsp");
		String Angular = req.getParameter("angul");
		List<String> skillSet = new ArrayList<String>();
		skillSet.add(Java);
		skillSet.add(Php);
		skillSet.add(cPlus);
		skillSet.add(Js);
		skillSet.add(Json);
		skillSet.add(Wp);
		skillSet.add(Magnito);
		skillSet.add(Ruby);
		skillSet.add(Perl);
		skillSet.add(whiteSpace);
		skillSet.add(Linux);
		skillSet.add(Kali);
		skillSet.add(Jsp);
		skillSet.add(Angular);
		String skills = req.getParameter("skillSet");
		String CTC = req.getParameter("package");
		String experience = req.getParameter("exp");
		String IdName = req.getParameter("id");
		String idNum = req.getParameter("idn");
		System.out.println(name);
		System.out.println(email);
		System.out.println(num);
		System.out.println(Anum);
		System.out.println(gender);
		System.out.println(education);
		System.out.println(yop);
		System.out.println(Eboard);
		System.out.println(address);
		System.out.println(skillSet);
		System.out.println(CTC);
		System.out.println(experience);
		System.out.println(IdName);
		System.out.println(idNum);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h3>")
		.append(name)
		.append("<br>")
		.append(email)
		.append("<br>")
		.append(num)
		.append("<br>")
		.append(Anum)
		.append("<br>")
		.append(gender)
		.append("<br>")
		.append(education)
		.append("<br>")
		.append(yop)
		.append("<br>")
		.append(Eboard)
		.append("<br>")
		.append(address)
		.append("<br>")
		.append((CharSequence) skillSet)
		.append("<br>")
		.append(CTC)
		.append("<br>")
		.append(experience)
		.append("<br>")
		.append(IdName)
		.append("<br>")
		.append(idNum)
		.append("</h3>")
		.append("</body>")
		.append("</html>");
		
		JobApplicationDTO dtos=new JobApplicationDTO(name, email,Long.parseLong(num), Long.parseLong(Anum), gender, education, yop, Eboard, address, skillSet, Double.parseDouble(CTC), experience,IdName ,idNum);
		 System.out.println(dto.add(dtos));
	}

}
