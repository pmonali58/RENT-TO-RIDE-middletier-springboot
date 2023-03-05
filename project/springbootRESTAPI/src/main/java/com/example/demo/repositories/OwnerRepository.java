package com.example.demo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
@Transactional
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

	@Query("select o from Owner o where login_id=:l ")
	public Owner getOwner(Login l);
	
	@Modifying
	@Query("update Owner set govn_id_img=:file where owner_id=:id")
	public int uploadphoto(int id,byte[]file);
	
}
