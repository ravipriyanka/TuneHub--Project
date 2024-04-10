package com.kodnest.rhytmvista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.rhytmvista.entity.User;

public interface UserRepository 
extends JpaRepository<User, String>{

	public User findByEmail(String email);

}