package com.jwt.madan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.madan.domain.User;

public interface UserDAO extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
