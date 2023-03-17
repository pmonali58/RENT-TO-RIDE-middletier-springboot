package com.example.demo.entities;

public class AdminReg {
	
	String email_id, password,fname,lname,contact;
	
	

	public AdminReg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AdminReg(String email_id, String password, String fname, String lname, String contact) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	@Override
	public String toString() {
		return "AdminReg [email_id=" + email_id + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", contact=" + contact + "]";
	}
	
	

}
