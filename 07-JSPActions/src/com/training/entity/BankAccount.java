package com.training.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
	int id;
	String customerName;
	double balance;
	private Date dob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", customerName=" + customerName
				+ ", balance=" + balance + ", dob=" + dob + "]";
	}
	
	public void setDate1(String str){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1 = sdf.parse(str);
			this.dob = d1;
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
