package com.example.WheelWise.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WheelWise.entities.User;
import com.example.WheelWise.services.UserService;

@RestController
public class SignUpController {

	@Autowired
	UserService service;
	@RequestMapping("/signup")
    public String signup() {
        return "Sign Up page..";
    }
	
	 @PostMapping("/signup")
	    public User addUser(@RequestBody User user) {
	        service.createUser(user);
	        return user;
	    }
}
