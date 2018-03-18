package com.jwt.madan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.madan.domain.AppUser;

public interface UserDAO extends JpaRepository<AppUser, Long> {
	
	AppUser findByUsername(String username);

}
