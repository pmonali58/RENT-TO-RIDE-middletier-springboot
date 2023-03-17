package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int a_id;
	@Column
	String apartment_no;
	@Column
	String area;
	@Column
	String city;
	@Column
	String state;
	@Column
	String country;
	@Column
	String pincode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String apartment_no, String area, String city, String state, String country, String pincode) {
		super();
		this.apartment_no = apartment_no;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
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

	@Override
	public String toString() {
		return "Address [a_id=" + a_id + ", apartment_no=" + apartment_no + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	

}
