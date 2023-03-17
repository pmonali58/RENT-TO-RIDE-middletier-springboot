package com.example.demo.entities;

public class VehicleReg {

	
	String Veh_name;
	
	String type;
	
	String plate_number;
	
	int own_id;
	
	int login_id;
	
	double charges_per_hour;
	double charges_per_day;


	public VehicleReg() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleReg(String veh_name, String type, String plate_number, int own_id, int login_id,
			double charges_per_hour, double charges_per_day) {
		super();
		Veh_name = veh_name;
		this.type = type;
		this.plate_number = plate_number;
		this.own_id = own_id;
		this.login_id = login_id;
		this.charges_per_hour = charges_per_hour;
		this.charges_per_day = charges_per_day;
	}


	public String getVeh_name() {
		return Veh_name;
	}


	public void setVeh_name(String veh_name) {
		Veh_name = veh_name;
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


	public int getOwn_id() {
		return own_id;
	}


	public void setOwn_id(int own_id) {
		this.own_id = own_id;
	}


	public int getLogin_id() {
		return login_id;
	}


	public void setLogin_id(int login_id) {
		this.login_id = login_id;
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


	@Override
	public String toString() {
		return "VehicleReg [Veh_name=" + Veh_name + ", type=" + type + ", plate_number=" + plate_number + ", own_id="
				+ own_id + ", login_id=" + login_id + ", charges_per_hour=" + charges_per_hour + ", charges_per_day="
				+ charges_per_day + "]";
	}

	
	



	
    	
	
}
