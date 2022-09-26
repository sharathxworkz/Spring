package com.xworkz.fire.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7,urlPatterns = "/fire")
public class FireServlet extends HttpServlet {

	public FireServlet() {
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am Receiving Information From Web");
		resp.setContentType("text/html");
		String name = req.getParameter("alias");
		String company = req.getParameter("compay");
		String pacakge = req.getParameter("salary");
		System.out.println("Name is:".concat(name));
		System.out.println("Company is:".concat(company));
		System.out.println("Package is:".concat(pacakge));
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append(name)
		.append("<br>")
		.append(company)
		.append("<br>")
		.append(pacakge)
		.append("<br>")
		.append("Edyu Benki")
		.append("</h1>")
		.append("</body")
		.append("</html>");
	}
}
