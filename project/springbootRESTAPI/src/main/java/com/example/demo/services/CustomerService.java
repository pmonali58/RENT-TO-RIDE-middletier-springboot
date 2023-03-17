package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired	
	 CustomerRepository crepo;
	
	public Customer getCustomer(Login l)
	{
		return crepo.getCustomer(l);
	}
	
	public Customer saveCustomer(Customer c)
	{
		return crepo.save(c);
	}
	
	public boolean upload(int id,byte []photo)
	{
		if(crepo.uploadphoto(id, photo)==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		  
	}
	public List<Customer> UnapproveCust()
	{
		return crepo.UnapproveCust();
	}
	
	public int approveCust(int cust_id)
	{
		System.out.println(cust_id);
		return crepo.approveCust(cust_id);
		
	}

}
