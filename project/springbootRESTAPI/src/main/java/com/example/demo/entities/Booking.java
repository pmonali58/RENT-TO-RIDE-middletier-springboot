package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int book_id;
	
	int veh_id;
	int cust_id;
	Date issue_date;
	Date return_date;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int veh_id, int cust_id, Date issue_date, Date return_date) {
		super();
		this.veh_id = veh_id;
		this.cust_id = cust_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getVeh_id() {
		return veh_id;
	}
	public void setVeh_id(int veh_id) {
		this.veh_id = veh_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	@Override
	public String toString() {
		return "Booking [book_id=" + book_id + ", veh_id=" + veh_id + ", cust_id=" + cust_id + ", issue_date="
				+ issue_date + ", return_date=" + return_date + "]";
	}
	
	
	

}
