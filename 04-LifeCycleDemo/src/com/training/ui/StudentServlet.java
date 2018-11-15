package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(urlPatterns = { "/StudentServlet" }, initParams = {
		@WebInitParam(name = "i_rollNo", value = "118"),
		@WebInitParam(name = "i_name", value = "Prasanthi"),
		@WebInitParam(name = "i_age", value = "21") })
public class StudentServlet extends HttpServlet {
	private int rollNo;
	private String name;
	private int age;

	@Override
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		String strRoll = config.getInitParameter("i_rollNo");
		String strName = config.getInitParameter("i_name");
		String strAge = config.getInitParameter("i_age");
		this.rollNo = Integer.parseInt(strRoll);
		this.name = strName;
		this.age = Integer.parseInt(strAge);
	}

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
		PrintWriter out = response.getWriter();
		out.println("Roll No : "+this.rollNo+"<br>");
		out.println("Name : "+this.name+"<br>");
		out.println("Age : "+this.age+"<br>");
	}

}
