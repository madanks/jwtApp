package com.jwt.madan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.madan.domain.AppUser;
import com.jwt.madan.repository.UserDAO;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserDAO applicationUserRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/sign-up")
	public void signUp(@RequestBody AppUser user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		applicationUserRepository.save(user);
	}

}
