package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admin_id;
	
	@Column
	private String fname;

	@Column
	private String lname;
	
	@Column
	private String contact;

	@OneToOne
	@JoinColumn(name="login_id")
	Login login_id;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String fname,String lname,String contact,Login login_id) 
	{
		super();
		
		this.fname =fname;
		this.lname =lname;
		this.contact=contact;
		this.login_id=login_id;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
		this.fname = lname;
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


	public void setLogin_id(Login login_id) 
	{
		this.login_id = login_id;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
				+ ", login_id=" + login_id + "]";
	}
	

	
	

}
