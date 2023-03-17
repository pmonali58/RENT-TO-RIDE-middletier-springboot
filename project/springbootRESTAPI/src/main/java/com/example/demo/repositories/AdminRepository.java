package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;

@Transactional
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> 
{
	

	@Query("select a from Admin a where login_id=:l ")
	public Admin getAdmin(Login l);
}
