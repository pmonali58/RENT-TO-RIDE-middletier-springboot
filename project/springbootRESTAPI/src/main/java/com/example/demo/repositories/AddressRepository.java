package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	@Query("select a from Address a where a_id=:a")
	public Address getAddress(Address a);
	
}
