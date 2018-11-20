package com.app.hospitalservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.hospitalservice.entities.Hospital;
import com.app.hospitalservice.entities.User;
import com.app.hospitalservice.services.HospitalServiceImpl;
import com.app.hospitalservice.services.UserServiceImpl;

@RestController
public class AppController {

	@Autowired
	HospitalServiceImpl hRepo;
	
	@Autowired
	UserServiceImpl userRepo;
	
	/**
	 * method to accept and register user
	 * 
	 * @param User
	 * 
	 * @return User
	 */
	@PostMapping(value = "/userRegistration")
	public User register(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	/**
	 * method to validate and return user on login
	 * 
	 * @param User
	 * 
	 * @return User
	 */
	@PostMapping(value = "/login")
	public User login(@RequestBody User currentUser) {
		
		User user = userRepo.findByUsername(currentUser.getUsername());
		if(user.getPassword().equals(currentUser.getPassword()))
		return user;
		else
			return null;
			
	}
	
	/**
	 * method to get list of Users
	 * 
	 * @param none
	 * 
	 * @return List<User>
	 */
	@GetMapping(value = "/getAllUsers")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	/**
	 * method to delete a user through userID
	 * 
	 * @param id: Long
	 * 
	 * @return List<User>
	 */
	@GetMapping(value = "/deleteUser/{id}")
	public List<User> deleteUser(@PathVariable Long id) {
		userRepo.delete(id);
		return userRepo.findAll();
	}
	
	/**
	 * method to get list of all hospitals
	 * 
	 * @param none
	 * 
	 * @return List<Hospital>
	 */
	@RequestMapping("/hospitals")
	public List<Hospital> getHospitals() {
		
		List<Hospital> hospitals = hRepo.findAll();
		return hospitals;
	}
	
	/**
	 * method to get list of all hospitals by city
	 * 
	 * @param city: String
	 * 
	 * @return List<Hospital>
	 */
	@GetMapping(value = "/getHospitals/{city}")
	public List<Hospital> getHospitalsByCity(@PathVariable String city) {
		return hRepo.findByCity(city);
	}
	
}
