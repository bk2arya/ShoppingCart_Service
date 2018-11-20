package com.app.hospitalservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.hospitalservice.entities.Hospital;
import com.app.hospitalservice.repos.HospitalRepo;

@Service
public class HospitalServiceImpl {

	@Autowired
	private HospitalRepo hospitalRepo;
	
	public List<Hospital> findByCity(String city){
		return hospitalRepo.findByCity(city);
	}
	
	public List<Hospital> findAll(){
		return hospitalRepo.findAll();
	}
}
