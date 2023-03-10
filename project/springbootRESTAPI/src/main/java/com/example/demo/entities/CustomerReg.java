package com.example.demo.entities;

public class CustomerReg {
	String email_id, password,fname,lname,contact, apartment_no,area,city,state,
    country,pincode,dl_number;
	int age;

	public CustomerReg() {
		super();
		
	}

	public CustomerReg(String email_id, String password, String fname, String lname, String contact,
			String apartment_no, String area, String city, String state, String country, String pincode,int age,
			String dl_number) {
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
		this.age = age;
		this.dl_number = dl_number;
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
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDl_number() {
		return dl_number;
	}

	public void setDl_number(String dl_number) {
		this.dl_number = dl_number;
	}
	
	
	
	

}
