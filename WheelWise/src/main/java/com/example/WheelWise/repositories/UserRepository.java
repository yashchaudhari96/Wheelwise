package com.example.WheelWise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WheelWise.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}