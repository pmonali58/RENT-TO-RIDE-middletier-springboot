package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.entities.Vehicle;
import com.example.demo.entities.VehicleReg;
import com.example.demo.repositories.VehicleRepository;
import com.example.demo.services.LoginService;
import com.example.demo.services.OwnerService;
import com.example.demo.services.VehicleService;

import com.example.demo.services.OwnerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VehicleController {

	@Autowired
	LoginService lservice;
	@Autowired
	VehicleService vservice;
	
	@Autowired
	OwnerService oservice;
	
    @Autowired  
	VehicleRepository vrepo;
    
	@GetMapping("/getVehicle")
	public List<Vehicle> getVehicle(@RequestParam ("own_id") int own_id)
	{
		System.out.println("Inside vehicle controller--->:"+own_id);
		Owner o= oservice.getById(own_id);
		return vservice.getVehicle(own_id);
	}

    
	@PostMapping("/regVehicle")
	
    public Vehicle regVehicle(@RequestBody VehicleReg vr ) {
       
		System.out.println(vr);
		//int login_id=vr.getLogin_id();
		//int own_id=vr.getOwn_id();
		//Owner savedO=oservice.getOwnerById(login_id);
		//Owner savedO=oservice.getById(own_id);
		//System.out.println(savedO);
		//Vehicle v=new Vehicle(vr.getVeh_name(),vr.getType(),vr.getPlate_number(),false,savedO);
		Vehicle v=new Vehicle(vr.getVeh_name(),vr.getType(),vr.getPlate_number(),0,vr.getOwn_id());

		System.out.println(v);
        return vservice.saveVehicle(v);
    }
	@PostMapping(value="/uploadvehicle/{veh_id}",consumes="multipart/form-data")
   public boolean uploadvehicle(@PathVariable("veh_id") int veh_id ,@RequestBody MultipartFile  file)
	{
		 boolean flag =true;
		 try {
		     flag=vservice.upload(veh_id, file.getBytes());
		 }
		 catch(Exception e)
		 {
			 flag=false;
		 }
		 return flag;
	}
}
