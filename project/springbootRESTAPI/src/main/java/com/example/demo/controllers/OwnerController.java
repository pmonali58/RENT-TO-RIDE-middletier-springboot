package com.example.demo.controllers;

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
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.services.AddressService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OwnerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OwnerController {

	@Autowired
	OwnerService oservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	AddressService aservice;
	@GetMapping("/getOwner")
	public Owner getOwner(@RequestParam ("login_id") int login_id)
	{
		Login l= lservice.getById(login_id);
		return oservice.getOwner(l);
	}
	@PostMapping("/regOwner")
	public Owner regOwner(@RequestBody OwnerReg or)
	{
		Address a=new Address(or.getApartment_no(),or.getArea(),or.getCity(),or.getState(),or.getCountry(),or.getPincode());
		Address savedA = aservice.saveAddress(a);
		Login l=new Login(or.getEmail_id(),or.getPassword(),"owner");
		Login saved = lservice.save(l);
		Owner o=new Owner(or.getFname(),or.getLname(),or.getContact(),savedA,saved,or.getGovn_id_no());
		System.out.println(o);
	 return oservice.saveOwner(o);
	}
	@PostMapping(value="/uploadImg/{o_id}",consumes="multipart/form-data")
	public boolean uploadImg(@PathVariable("o_id") int o_id ,@RequestBody MultipartFile  file)
	{
		 boolean flag =true;
		 try {
		     flag=oservice.upload(o_id, file.getBytes());
		 }
		 catch(Exception e)
		 {
			 flag=false;
		 }
		 return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
