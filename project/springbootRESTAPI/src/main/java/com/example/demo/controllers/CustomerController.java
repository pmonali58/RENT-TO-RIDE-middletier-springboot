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
import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerReg;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.services.AddressService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController {
	@Autowired
	CustomerService cservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	AddressService aservice;
	
	@GetMapping("/getCustomer")
	public Customer getCustomer(@RequestParam ("login_id") int login_id)
	{
		Login l= lservice.getById(login_id);
		return cservice.getCustomer(l);
	}
	
	@PostMapping("/regCustomer")
	public Customer regCustomer(@RequestBody CustomerReg cr)
	{
		System.out.println(cr);
		Address a=new Address(cr.getApartment_no(),cr.getArea(),cr.getCity(),cr.getState(),cr.getCountry(),cr.getPincode());
		Address savedA = aservice.saveAddress(a);
		Login l=new Login(cr.getEmail_id(),cr.getPassword(),"customer");
		Login saved = lservice.save(l);
		Customer c=new Customer(cr.getFname(),cr.getLname(),cr.getContact(),savedA,saved,cr.getAge(),cr.getDl_number());
		System.out.println(c);
	 return cservice.saveCustomer(c);
	}
	
	@PostMapping(value="/uploadImg/{cust_id}",consumes="multipart/form-data")
	public boolean uploadImg(@PathVariable("cust_id") int cust_id ,@RequestBody MultipartFile  file)
	{
		 boolean flag =true;
		 try {
		     flag=cservice.upload(cust_id, file.getBytes());
		 }
		 catch(Exception e)
		 {
			 flag=false;
		 }
		 return flag;
	}


}
