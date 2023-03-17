package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int own_id;
	String fname,lname,contact;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="a_id",referencedColumnName="a_id")
	Address a_id;
	@OneToOne
	@JoinColumn(name="login_id")
	Login login_id;
//	@Column
//	int login_id;
	String govn_id_no;
	byte []govn_id_img;
	int istatus;
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Owner( String fname, String lname, String contact, Address a_id, Login login_id, String govn_id_no,int istatus
			) {
		super();
	
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.a_id = a_id;
		this.login_id = login_id;
		this.govn_id_no = govn_id_no;
		this.istatus=istatus;
		
	}


	public int getIstatus() {
		return istatus;
	}


	public void setIstatus(int istatus) {
		this.istatus = istatus;
	}


	public int getOwn_id() {
		return own_id;
	}


	public void setOwn_id(int own_id) {
		this.own_id = own_id;
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


	public Login getLogin_id() {
		return login_id;
	}


	public void setLogin_id(Login login_id) {
		this.login_id = login_id;
	}


	public String getGovn_id_no() {
		return govn_id_no;
	}


	public void setGovn_id_no(String govn_id_no) {
		this.govn_id_no = govn_id_no;
	}
	


	public Address getA_id() {
		return a_id;
	}


	public void setA_id(Address a_id) {
		this.a_id = a_id;
	}


	@Override
	public String toString() {
		return "Owner [own_id=" + own_id + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact + ", a_id="
				+ a_id + ", login_id=" + login_id + ", govn_id_no=" + govn_id_no + ", govn_id_img="
				+ Arrays.toString(govn_id_img) + ", istatus=" + istatus + "]";
	}


	
	
	
	
}
