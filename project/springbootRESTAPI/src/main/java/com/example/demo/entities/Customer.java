package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cust_id;
	String fname,lname,contact;
	@OneToOne
	@JoinColumn(name="a_id")
	Address a_id;
	@OneToOne
	@JoinColumn(name="login_id")
	Login login_id;
	int age;
	String dl_number;
	byte []dl_image;
	int istatus;
	
	public Customer() {
		super();
		
	}


	public Customer(String fname, String lname, String contact, Address a_id, Login login_id,int age,
			String dl_number,int istatus) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.a_id = a_id;
		this.login_id = login_id;
		this.age=age;
		this.dl_number = dl_number;
		//this.dl_image = dl_image;
		this.istatus=istatus;
	}


	public int getIstatus() {
		return istatus;
	}


	public void setIstatus(int istatus) {
		this.istatus = istatus;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
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


	public Address getA_id() {
		return a_id;
	}


	public void setA_id(Address a_id) {
		this.a_id = a_id;
	}


	public Login getLogin_id() {
		return login_id;
	}


	public void setLogin_id(Login login_id) {
		this.login_id = login_id;
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


	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
				+ ", a_id=" + a_id + ", login_id=" + login_id + ", age=" + age + ", dl_number=" + dl_number
				+ ", dl_image=" + Arrays.toString(dl_image) + ", istatus=" + istatus + "]";
	}


	/*public byte[] getDl_image() {
		return dl_image;
	}


	public void setDl_image(byte[] dl_image) {
		this.dl_image = dl_image;
	}*/


	
	
	
	
	

}
