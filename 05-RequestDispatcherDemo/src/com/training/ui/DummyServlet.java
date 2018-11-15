package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DummyServlet
 */
@WebServlet("/DummyServlet")
public class DummyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("This is a dummy Servlet");
		
		String s1 = (String) request.getAttribute("NAME");
		String s2 = (String) request.getAttribute("NATIVE");
		Date d1 = (Date) request.getAttribute("TODAY");
		Integer i1 = (Integer) request.getAttribute("AGE");
		out.println("<br>Name: "+s1+"<br>");
		out.println("Native Place: "+s2+"<br>");
		out.println("Today's date: "+d1+"<br>");
		out.println("Age: "+i1+"<br>");
		
		request.removeAttribute("NAME");
	}

}
