package com.xworkz.test.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7,urlPatterns = "/test")
public class WaterServlet extends HttpServlet {

	public WaterServlet() {
		System.out.println("Calling Default Constructor OF WaterServlet Class");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Receiving Data From Web Index File");
		resp.setContentType("text/html");
		String name = req.getParameter("sname");
		String usn = req.getParameter("usn");
		String className = req.getParameter("class");
		String location = req.getParameter("location");
		System.out.println("The Student Name is:"+name);
		System.out.println("The Usn Of Student IS:"+usn);
		System.out.println("The Class Of Student is:"+className);
		System.out.println("The Locality Of Student is:"+location);
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<head>")
		.append("<body>")
		.append(name)
		.append("<br>")
		.append(usn)
		.append("<br>")
		.append(className)
		.append("<br>")
		.append(location)
		.append("</head>")
		.append("</body>")
		.append("</html>");
		
	}
}		