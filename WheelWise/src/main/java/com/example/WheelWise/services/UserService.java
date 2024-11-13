package com.example.WheelWise.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.WheelWise.entities.User;
import com.example.WheelWise.repositories.UserRepository;
@Service
public class UserService {

		@Autowired
	    private UserRepository userRepository;
	   
	    // Method to create a new user
	   
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    // Method to retrieve all users
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    // Method to retrieve a user by ID
	    public User getUserById(Integer userId) {
	        return userRepository.findById(userId).orElse(new User());
	    }
	    
}
