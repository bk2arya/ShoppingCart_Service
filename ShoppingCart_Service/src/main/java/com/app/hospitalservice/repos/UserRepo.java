package com.app.hospitalservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hospitalservice.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{
	
	public User findById(Long userId);

	public User findByUsername(String userName);

	public List<User> findByFirstname(String firstName);
	
    public List<User> findAll();
	
	public User save(User user);
	
	public void delete(User user);

}
