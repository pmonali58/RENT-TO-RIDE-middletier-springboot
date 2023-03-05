package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.repositories.OwnerRepository;

@Service
public class OwnerService {

	@Autowired	
	 OwnerRepository orepo;
	
	public Owner getOwner(Login l)
	{
		return orepo.getOwner(l);
	}
	
	public Owner saveOwner(Owner o)
	{
		return orepo.save(o);
	}
	
	public boolean upload(int id,byte []photo)
	{
		if(orepo.uploadphoto(id, photo)==1)
		  return true;
		else
			return false;
		
	}
}
