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
 * Servlet implementation class EmpServlet
 */
@WebServlet("/emp1")
public class EmpServlet extends HttpServlet {
	private int id;
	private String name;
	private double salary;
	
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n\n\t\t" + new Date());
		System.out.println("\t\tResult: "+this.add(10,20));
		PrintWriter out = response.getWriter();
		out.println("ID: "+this.id+"<br>");
		out.println("NAME: "+this.name+"<br>");
		out.println("SALARY: "+this.salary+"<br>");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("\t\t***Init is called");
		this.id = 25;
		this.name = "Prasanthi";
		this.salary = 25000.00;
	}
	@Override
	public void destroy() {
		System.out.println("\n\n\t\t***Destroy is called");
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	
	
	
	
	
}
