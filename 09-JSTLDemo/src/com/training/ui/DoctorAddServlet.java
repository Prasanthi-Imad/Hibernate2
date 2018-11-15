package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.treining.entity.Doctor;

/**
 * Servlet implementation class DoctorAddServlet
 */
@WebServlet("/DoctorAddServlet")
public class DoctorAddServlet extends HttpServlet {
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
		int id= Integer.parseInt(request.getParameter("txt1"));
		String name = request.getParameter("txt2");
		String qualification = request.getParameter("txt3");
		String gender = request.getParameter("txt4");
		int experience= Integer.parseInt(request.getParameter("txt5"));
		double fees = Double.parseDouble(request.getParameter("txt6"));
		Doctor d = new Doctor();
		d.setId(id);
		d.setName(name);
		d.setQualification(qualification);
		d.setGender(gender);
		d.setExperience(experience);
		d.setFees(fees);
		
		HttpSession session = request.getSession();
		List<Doctor> doctors = null;
		doctors = (List<Doctor>) session.getAttribute("DOCTORS");
		if(doctors==null){
			doctors = new ArrayList<Doctor>();
			session.setAttribute("DOCTORS", doctors);
		}
		doctors.add(d);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Display4.jsp");
		dispatcher.forward(request, response);
		
	}

}
