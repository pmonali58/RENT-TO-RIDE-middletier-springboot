package com.example.demo.entities;
import java.util.Arrays;

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
	@Column
	int own_id;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String veh_name, String type, String plate_number, int istatus,int own_id) {
		super();
		this.veh_name = veh_name;
		this.type = type;
		this.plate_number = plate_number;
		this.istatus = istatus;
		this.own_id=own_id;
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
	public int IStatus() {
		return istatus;
	}
	public void setIStatus(int istatus) {
		this.istatus = istatus;
	}
	public int getOwn_id() {
		return own_id;
	}
	public void setOwn_id(int own_id) {
		this.own_id = own_id;
	}
	@Override
	public String toString() {
		return "Vehicle [veh_id=" + veh_id + ", veh_name=" + veh_name + ", type=" + type + ", plate_number="
				+ plate_number + ", vehimage=" + Arrays.toString(vehimage) + ", istatus=" + istatus + ", own_id=" + own_id
				+ "]";
	}
	
	
}
