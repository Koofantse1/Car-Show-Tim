package com.ajBinary.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ajBinary.entity.User;
import com.ajBinary.repository.UserRepository;

public class UseerServiceImpl implements UserDetailsService{
	
	private UserRepository userRepository;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Optional<User> userOpt = userRepository.findByUsername(username);
	UserBuilder builder = null;
	if(userOpt.isPresent()) {
		User currentUser = userOpt.get();
		builder = org.springframework.security.core.userdetails.User.withUsername(username);
		builder.password(currentUser.getPassword());
		builder.roles(currentUser.getRole());
		return builder.build();
		
	}else {
		throw new UsernameNotFoundException("user not found");
	}
		
	}
	

}
