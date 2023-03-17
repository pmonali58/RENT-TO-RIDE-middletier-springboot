package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.entities.AdminReg;
import com.example.demo.entities.Owner;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.entities.Vehicle;
import com.example.demo.entities.VehicleReg;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.services.AdminService;
import com.example.demo.services.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdminController
{
	@Autowired
	AdminService aservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	SaltValue saltValue;
	
	@GetMapping("/getAdmin")
	public Admin getAdmin(@RequestParam ("login_id") int login_id)
	{
		System.out.println("Inside owner controller--->:"+login_id);
		Login l= lservice.getById(login_id);
		return aservice.getAdmin(l);
	}

	
	@PostMapping("/regAdmin")
    public Admin regAdmin(@RequestBody AdminReg ar ) {
       
		//System.out.println(vr);
		
     System.out.println(saltValue.getSalt());
		
		String encrypted=PassBasedEnc.generateSecurePassword(ar.getPassword(),saltValue.getSalt());
		Login l=new Login(ar.getEmail_id(),encrypted,"admin");
		Login saved = lservice.save(l);
		Admin a= new Admin(ar.getFname(),ar.getLname(),ar.getContact(),saved);

		//System.out.println(v);
        return aservice.saveAdmin(a);
    }
	
	
	
}
