package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.Vehicle;

@Transactional
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
	@Query("select v from Vehicle v where own_id=:o")
	public List<Vehicle> getVehicle(int o);


	@Modifying
	@Query("update Vehicle set vehimage =:file where veh_id=:id")
	public int uploadphoto(int id,byte[]file);
	
}
