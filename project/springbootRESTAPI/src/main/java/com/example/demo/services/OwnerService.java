package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.OwnerRepository;

@Service
public class OwnerService {

	@Autowired	
	OwnerRepository orepo;
	@Autowired
	LoginRepository lrepo;
	
	public Owner getOwner(Login l)
	{
		return orepo.getOwner(l);
	}
	
	public Owner getById(int own_id)
	{
		return orepo.findById(own_id).get();
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
	public List<Owner> UnapproveOwn()
	{
		return orepo.UnapproveOwn();
	}
	
	public int approveOwn(int own_id)
	{
		System.out.println(own_id);
		return orepo.approveOwn(own_id);
		
	}
}
