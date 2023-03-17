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
	
	public void deleteVehicle(int veh_id)
	{
		 vrepo.deleteById(veh_id);;
	}
	
	public List<Vehicle> getVehicle(int o)
	{
		return vrepo.getVehicle(o);
	}

    public Vehicle getById(int veh_id)
    {
    	return vrepo.findById(veh_id).get();
    }
	
	public List<Vehicle> getAllVehicle()
	{
		return vrepo.findAllByBook();
//		return vrepo.findAll();
		
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
    public List<Vehicle> UnapproveVeh()
	{
		return vrepo.UnapproveVeh();
	}
	
	public int approveVeh(int veh_id)
	{
		System.out.println(veh_id);
		return vrepo.approveVeh(veh_id);
		
	}
}