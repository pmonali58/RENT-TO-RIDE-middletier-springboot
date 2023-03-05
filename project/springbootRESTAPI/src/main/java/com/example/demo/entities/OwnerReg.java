package com.example.demo.entities;

public class OwnerReg {

	String email_id, password,fname,lname,contact, apartment_no,area,city,state,
    country,pincode,govn_id_no;
	

	
	public OwnerReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OwnerReg(String email_id, String password, String fname, String lname, String contact, String apartment_no,
			String area, String city, String state, String country, String pincode, String govn_id_no) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.apartment_no = apartment_no;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.govn_id_no = govn_id_no;
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

	public String getApartment_no() {
		return apartment_no;
	}

	public void setApartment_no(String apartment_no) {
		this.apartment_no = apartment_no;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGovn_id_no() {
		return govn_id_no;
	}

	public void setGovn_id_no(String govn_id_no) {
		this.govn_id_no = govn_id_no;
	}

	
    
    
   
    
   

    
   
}
