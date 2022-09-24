package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 11,urlPatterns = "/burn")
public class ColorServlet extends HttpServlet {

	public ColorServlet() {
		System.out.println("ColorServlet Default Constructor Called");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am Receiving Information From Web");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><body bgcolor='black'><h1 style='color:white;'>"+"Idu White").append("</h1></head></body></html>");
	}
}
