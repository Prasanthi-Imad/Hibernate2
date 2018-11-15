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

import com.treining.entity.Doctor;

/**
 * Servlet implementation class DoctorCreatingServlet
 */
@WebServlet("/DoctorCreatingServlet")
public class DoctorCreatingServlet extends HttpServlet {
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
		Doctor doc1 = new Doctor();
		doc1.setId(1);
		doc1.setName("Ravi Kiran");
		doc1.setQualification("M.D");
		doc1.setGender("Male");
		doc1.setExperience(12);
		doc1.setFees(1200);
		request.setAttribute("DOC", doc1);
		
		Doctor doc2 = new Doctor();
		doc2.setId(2);
		doc2.setName("Akhil Kiran");
		doc2.setQualification("MBBS");
		doc2.setGender("Male");
		doc2.setExperience(10);
		doc2.setFees(1100);
		request.setAttribute("DOC", doc2);
		
		Doctor doc3 = new Doctor();
		doc3.setId(3);
		doc3.setName("Prasanthi");
		doc3.setQualification("Neurologist");
		doc3.setGender("Female");
		doc3.setExperience(8);
		doc3.setFees(1000);
		request.setAttribute("DOC", doc3);
		
		Doctor doc4 = new Doctor();
		doc4.setId(4);
		doc4.setName("Subha Sri");
		doc4.setQualification("Dentist");
		doc4.setGender("Female");
		doc4.setExperience(6);
		doc4.setFees(900);
		request.setAttribute("DOC", doc4);
		
		Doctor doc5 = new Doctor();
		doc5.setId(5);
		doc5.setName("Bhavya");
		doc5.setQualification("Cardiologist");
		doc5.setGender("Female");
		doc5.setExperience(4);
		doc5.setFees(800);
		request.setAttribute("DOC", doc5);
		
		List<Doctor> doctor = new ArrayList<Doctor>();
		doctor.add(doc1);
		doctor.add(doc2);
		doctor.add(doc3);
		doctor.add(doc4);
		doctor.add(doc5);
		
		request.setAttribute("DOCTOR", doctor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Display4.jsp");
		dispatcher.forward(request, response);
		
	}

}
