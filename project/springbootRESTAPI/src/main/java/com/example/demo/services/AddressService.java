package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.repositories.AddressRepository;
@Service
public class AddressService {
	@Autowired	
	 AddressRepository arepo;
	
	
	public Address getAddress(Address a)
	{
		return arepo.getAddress(a);
	}
	public Address saveAddress(Address a)
	{
		return arepo.save(a);
	}
	public Address getById(int a_dd)
	{
		return arepo.findById(a_dd).get();
	}
}
