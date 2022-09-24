package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/burning")
public class SunServlet extends HttpServlet {

	public SunServlet() {
		System.out.println("SunServlet Default Constructor Called");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am Receiving Information From Web");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><body bgcolor='Yellow'><h1 style='color:black;'>"+"Idu Yellow").append("</h1></head></body></html>");
	}
}
