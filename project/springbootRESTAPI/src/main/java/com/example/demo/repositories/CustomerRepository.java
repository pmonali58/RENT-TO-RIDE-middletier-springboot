package com.example.demo.repositories;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Address;
import com.example.demo.entities.Customer;

	@Transactional
	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, Integer> {

		@Query("select c from Customer c where login_id=:l ")
		public Customer getCustomer(Login l);
		
		@Modifying
		@Query("update Customer set dl_image=:file where cust_id=:id")
		public int uploadphoto(int id,byte[]file);

	}

