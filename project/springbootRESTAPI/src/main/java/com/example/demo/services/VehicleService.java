package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Vehicle;
import com.example.demo.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	

	@Autowired
	VehicleRepository vrepo;
	
	public List<Vehicle> getVehicle(int o)
	{
		return vrepo.getVehicle(o);
	}


	public Vehicle saveVehicle(Vehicle v)
	{
		System.out.println("saved vehcie  repo==>"+v);
		return vrepo.save(v);
	}
    public boolean upload(int id,byte []photo)
	{
		if(vrepo.uploadphoto(id, photo)==1)
		  return true;
		else
		 return false;
		
	}
}