package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Address;
import com.example.demo.entities.Admin;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Customer;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.AdminRepository;
@Service
public class AdminService 
{

		@Autowired	
		 AdminRepository arepo;
		
		
		public Admin getAdmin(Login l)
		{
			return arepo.getAdmin(l);
		}
		
		public Admin saveAdmin(Admin a)
		{
			return arepo.save(a);
		}
		
}

