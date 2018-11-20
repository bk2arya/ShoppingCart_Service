package com.app.hospitalservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.hospitalservice.entities.User;
import com.app.hospitalservice.repos.UserRepo;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepo userRepo;
	
	public User findById(Long userId) {
		return userRepo.findById(userId);
	}

	public User findByUsername(String userName) {
		return userRepo.findByUsername(userName);
	}

	public List<User> findByFirstname(String firstName){
		return userRepo.findByFirstname(firstName);
	}
	
    public List<User> findAll(){
    	return userRepo.findAll();
    }
	
	public User save(User user) {
		return userRepo.save(user);
	}
	
	public void delete(User user) {
		userRepo.delete(user);
	}
	
	public void delete(Long id) {
		userRepo.delete(id);
	}

}
