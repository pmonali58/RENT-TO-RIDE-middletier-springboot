package com.example.demo.entities;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int veh_id;
	@Column
	String veh_name;
	@Column
	String type;
	@Column
	String plate_number;
	@Column
	byte []vehimage;
	@Column
	int istatus;
	//@ManyToOne
	//@JoinColumn(name= "own_id")
	//Owner owner;

	int own_id;

    double charges_per_hour;
    double charges_per_day;
    int is_book;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String veh_name, String type, String plate_number, int istatus, int own_id, double charges_per_hour,
			double charges_per_day, int is_book) {
		super();
		this.veh_name = veh_name;
		this.type = type;
		this.plate_number = plate_number;
		this.istatus = istatus;
		this.own_id = own_id;
		this.charges_per_hour = charges_per_hour;
		this.charges_per_day = charges_per_day;
		this.is_book = is_book;
	}
	public int getVeh_id() {
		return veh_id;
	}
	public void setVeh_id(int veh_id) {
		this.veh_id = veh_id;
	}
	public String getVeh_name() {
		return veh_name;
	}
	public void setVeh_name(String veh_name) {
		this.veh_name = veh_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlate_number() {
		return plate_number;
	}
	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}
	public byte[] getVehimage() {
		return vehimage;
	}
	public void setVehimage(byte[] vehimage) {
		this.vehimage = vehimage;
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
	public double getCharges_per_hour() {
		return charges_per_hour;
	}
	public void setCharges_per_hour(double charges_per_hour) {
		this.charges_per_hour = charges_per_hour;
	}
	public double getCharges_per_day() {
		return charges_per_day;
	}
	public void setCharges_per_day(double charges_per_day) {
		this.charges_per_day = charges_per_day;
	}
	public int getIs_book() {
		return is_book;
	}
	public void setIs_book(int is_book) {
		this.is_book = is_book;
	}
	@Override
	public String toString() {
		return "Vehicle [veh_id=" + veh_id + ", veh_name=" + veh_name + ", type=" + type + ", plate_number="
				+ plate_number + ", istatus=" + istatus + ", own_id=" + own_id + ", charges_per_hour="
				+ charges_per_hour + ", charges_per_day=" + charges_per_day + ", is_book=" + is_book + "]";
	}
	
	
}
