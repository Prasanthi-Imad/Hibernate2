package com.training.entity;

public class Doctor {
	String name = "Dr.Prasanthi";
	double consultantFees = 1000;
	int experience = 4;
	Clinic clinic = new Clinic();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getConsultantFees() {
		return consultantFees;
	}

	public void setConsultantFees(double consultantFees) {
		this.consultantFees = consultantFees;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	
}
