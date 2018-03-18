package com.jwt.madan.security;

import static java.util.Collections.emptyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.madan.repository.UserDAO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDAO applicationUserRepository;

	/*
	 * When a user tries to authenticate, this method receives the username,
	 * searches the database for a record containing it, and (if found) returns an
	 * instance of User
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.jwt.madan.domain.AppUser applicationUser = applicationUserRepository.findByUsername(username);
		if (applicationUser == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(applicationUser.getUsername(), applicationUser.getPassword(), emptyList());
	}

}
