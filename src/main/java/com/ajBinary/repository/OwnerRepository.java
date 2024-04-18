package com.ajBinary.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ajBinary.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

	Optional<Owner> findOwnerByFirstName(String firstName);
		
	}

	
	
	
	

