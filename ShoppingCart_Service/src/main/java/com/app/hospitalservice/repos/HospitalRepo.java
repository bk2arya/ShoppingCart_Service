package com.app.hospitalservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hospitalservice.entities.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

	public List<Hospital> findByCity(String city);
	
	public List<Hospital> findAll();
	
}
